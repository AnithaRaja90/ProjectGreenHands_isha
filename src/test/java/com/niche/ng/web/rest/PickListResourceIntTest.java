package com.niche.ng.web.rest;

import com.niche.ng.ProjectGhApp;

import com.niche.ng.domain.PickList;
import com.niche.ng.repository.PickListRepository;
import com.niche.ng.service.PickListService;
import com.niche.ng.service.dto.PickListDTO;
import com.niche.ng.service.mapper.PickListMapper;
import com.niche.ng.web.rest.errors.ExceptionTranslator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;


import static com.niche.ng.web.rest.TestUtil.createFormattingConversionService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the PickListResource REST controller.
 *
 * @see PickListResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjectGhApp.class)
public class PickListResourceIntTest {

    private static final String DEFAULT_PICK_LIST_NAME = "AAAAAAAAAA";
    private static final String UPDATED_PICK_LIST_NAME = "BBBBBBBBBB";

    private static final Integer DEFAULT_STATUS = 1;
    private static final Integer UPDATED_STATUS = 2;

    private static final Long DEFAULT_CREATED_BY = 1L;
    private static final Long UPDATED_CREATED_BY = 2L;

    private static final Long DEFAULT_MODIFIED_BY = 1L;
    private static final Long UPDATED_MODIFIED_BY = 2L;

    private static final Instant DEFAULT_CREATED_AT = Instant.ofEpochMilli(0L);
    private static final Instant UPDATED_CREATED_AT = Instant.now().truncatedTo(ChronoUnit.MILLIS);

    private static final Instant DEFAULT_UPDATED_AT = Instant.ofEpochMilli(0L);
    private static final Instant UPDATED_UPDATED_AT = Instant.now().truncatedTo(ChronoUnit.MILLIS);

    @Autowired
    private PickListRepository pickListRepository;


    @Autowired
    private PickListMapper pickListMapper;
    

    @Autowired
    private PickListService pickListService;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    private MockMvc restPickListMockMvc;

    private PickList pickList;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final PickListResource pickListResource = new PickListResource(pickListService);
        this.restPickListMockMvc = MockMvcBuilders.standaloneSetup(pickListResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static PickList createEntity(EntityManager em) {
        PickList pickList = new PickList()
            .pickListName(DEFAULT_PICK_LIST_NAME)
            .status(DEFAULT_STATUS)
            .createdBy(DEFAULT_CREATED_BY)
            .modifiedBy(DEFAULT_MODIFIED_BY)
            .createdAt(DEFAULT_CREATED_AT)
            .updatedAt(DEFAULT_UPDATED_AT);
        return pickList;
    }

    @Before
    public void initTest() {
        pickList = createEntity(em);
    }

    @Test
    @Transactional
    public void createPickList() throws Exception {
        int databaseSizeBeforeCreate = pickListRepository.findAll().size();

        // Create the PickList
        PickListDTO pickListDTO = pickListMapper.toDto(pickList);
        restPickListMockMvc.perform(post("/api/pick-lists")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(pickListDTO)))
            .andExpect(status().isCreated());

        // Validate the PickList in the database
        List<PickList> pickListList = pickListRepository.findAll();
        assertThat(pickListList).hasSize(databaseSizeBeforeCreate + 1);
        PickList testPickList = pickListList.get(pickListList.size() - 1);
        assertThat(testPickList.getPickListName()).isEqualTo(DEFAULT_PICK_LIST_NAME);
        assertThat(testPickList.getStatus()).isEqualTo(DEFAULT_STATUS);
        assertThat(testPickList.getCreatedBy()).isEqualTo(DEFAULT_CREATED_BY);
        assertThat(testPickList.getModifiedBy()).isEqualTo(DEFAULT_MODIFIED_BY);
        assertThat(testPickList.getCreatedAt()).isEqualTo(DEFAULT_CREATED_AT);
        assertThat(testPickList.getUpdatedAt()).isEqualTo(DEFAULT_UPDATED_AT);
    }

    @Test
    @Transactional
    public void createPickListWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = pickListRepository.findAll().size();

        // Create the PickList with an existing ID
        pickList.setId(1L);
        PickListDTO pickListDTO = pickListMapper.toDto(pickList);

        // An entity with an existing ID cannot be created, so this API call must fail
        restPickListMockMvc.perform(post("/api/pick-lists")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(pickListDTO)))
            .andExpect(status().isBadRequest());

        // Validate the PickList in the database
        List<PickList> pickListList = pickListRepository.findAll();
        assertThat(pickListList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void checkPickListNameIsRequired() throws Exception {
        int databaseSizeBeforeTest = pickListRepository.findAll().size();
        // set the field null
        pickList.setPickListName(null);

        // Create the PickList, which fails.
        PickListDTO pickListDTO = pickListMapper.toDto(pickList);

        restPickListMockMvc.perform(post("/api/pick-lists")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(pickListDTO)))
            .andExpect(status().isBadRequest());

        List<PickList> pickListList = pickListRepository.findAll();
        assertThat(pickListList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void getAllPickLists() throws Exception {
        // Initialize the database
        pickListRepository.saveAndFlush(pickList);

        // Get all the pickListList
        restPickListMockMvc.perform(get("/api/pick-lists?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(pickList.getId().intValue())))
            .andExpect(jsonPath("$.[*].pickListName").value(hasItem(DEFAULT_PICK_LIST_NAME.toString())))
            .andExpect(jsonPath("$.[*].status").value(hasItem(DEFAULT_STATUS)))
            .andExpect(jsonPath("$.[*].createdBy").value(hasItem(DEFAULT_CREATED_BY.intValue())))
            .andExpect(jsonPath("$.[*].modifiedBy").value(hasItem(DEFAULT_MODIFIED_BY.intValue())))
            .andExpect(jsonPath("$.[*].createdAt").value(hasItem(DEFAULT_CREATED_AT.toString())))
            .andExpect(jsonPath("$.[*].updatedAt").value(hasItem(DEFAULT_UPDATED_AT.toString())));
    }
    

    @Test
    @Transactional
    public void getPickList() throws Exception {
        // Initialize the database
        pickListRepository.saveAndFlush(pickList);

        // Get the pickList
        restPickListMockMvc.perform(get("/api/pick-lists/{id}", pickList.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(pickList.getId().intValue()))
            .andExpect(jsonPath("$.pickListName").value(DEFAULT_PICK_LIST_NAME.toString()))
            .andExpect(jsonPath("$.status").value(DEFAULT_STATUS))
            .andExpect(jsonPath("$.createdBy").value(DEFAULT_CREATED_BY.intValue()))
            .andExpect(jsonPath("$.modifiedBy").value(DEFAULT_MODIFIED_BY.intValue()))
            .andExpect(jsonPath("$.createdAt").value(DEFAULT_CREATED_AT.toString()))
            .andExpect(jsonPath("$.updatedAt").value(DEFAULT_UPDATED_AT.toString()));
    }
    @Test
    @Transactional
    public void getNonExistingPickList() throws Exception {
        // Get the pickList
        restPickListMockMvc.perform(get("/api/pick-lists/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updatePickList() throws Exception {
        // Initialize the database
        pickListRepository.saveAndFlush(pickList);

        int databaseSizeBeforeUpdate = pickListRepository.findAll().size();

        // Update the pickList
        PickList updatedPickList = pickListRepository.findById(pickList.getId()).get();
        // Disconnect from session so that the updates on updatedPickList are not directly saved in db
        em.detach(updatedPickList);
        updatedPickList
            .pickListName(UPDATED_PICK_LIST_NAME)
            .status(UPDATED_STATUS)
            .createdBy(UPDATED_CREATED_BY)
            .modifiedBy(UPDATED_MODIFIED_BY)
            .createdAt(UPDATED_CREATED_AT)
            .updatedAt(UPDATED_UPDATED_AT);
        PickListDTO pickListDTO = pickListMapper.toDto(updatedPickList);

        restPickListMockMvc.perform(put("/api/pick-lists")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(pickListDTO)))
            .andExpect(status().isOk());

        // Validate the PickList in the database
        List<PickList> pickListList = pickListRepository.findAll();
        assertThat(pickListList).hasSize(databaseSizeBeforeUpdate);
        PickList testPickList = pickListList.get(pickListList.size() - 1);
        assertThat(testPickList.getPickListName()).isEqualTo(UPDATED_PICK_LIST_NAME);
        assertThat(testPickList.getStatus()).isEqualTo(UPDATED_STATUS);
        assertThat(testPickList.getCreatedBy()).isEqualTo(UPDATED_CREATED_BY);
        assertThat(testPickList.getModifiedBy()).isEqualTo(UPDATED_MODIFIED_BY);
        assertThat(testPickList.getCreatedAt()).isEqualTo(UPDATED_CREATED_AT);
        assertThat(testPickList.getUpdatedAt()).isEqualTo(UPDATED_UPDATED_AT);
    }

    @Test
    @Transactional
    public void updateNonExistingPickList() throws Exception {
        int databaseSizeBeforeUpdate = pickListRepository.findAll().size();

        // Create the PickList
        PickListDTO pickListDTO = pickListMapper.toDto(pickList);

        // If the entity doesn't have an ID, it will be created instead of just being updated
        restPickListMockMvc.perform(put("/api/pick-lists")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(pickListDTO)))
            .andExpect(status().isBadRequest());

        // Validate the PickList in the database
        List<PickList> pickListList = pickListRepository.findAll();
        assertThat(pickListList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deletePickList() throws Exception {
        // Initialize the database
        pickListRepository.saveAndFlush(pickList);

        int databaseSizeBeforeDelete = pickListRepository.findAll().size();

        // Get the pickList
        restPickListMockMvc.perform(delete("/api/pick-lists/{id}", pickList.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<PickList> pickListList = pickListRepository.findAll();
        assertThat(pickListList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(PickList.class);
        PickList pickList1 = new PickList();
        pickList1.setId(1L);
        PickList pickList2 = new PickList();
        pickList2.setId(pickList1.getId());
        assertThat(pickList1).isEqualTo(pickList2);
        pickList2.setId(2L);
        assertThat(pickList1).isNotEqualTo(pickList2);
        pickList1.setId(null);
        assertThat(pickList1).isNotEqualTo(pickList2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(PickListDTO.class);
        PickListDTO pickListDTO1 = new PickListDTO();
        pickListDTO1.setId(1L);
        PickListDTO pickListDTO2 = new PickListDTO();
        assertThat(pickListDTO1).isNotEqualTo(pickListDTO2);
        pickListDTO2.setId(pickListDTO1.getId());
        assertThat(pickListDTO1).isEqualTo(pickListDTO2);
        pickListDTO2.setId(2L);
        assertThat(pickListDTO1).isNotEqualTo(pickListDTO2);
        pickListDTO1.setId(null);
        assertThat(pickListDTO1).isNotEqualTo(pickListDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(pickListMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(pickListMapper.fromId(null)).isNull();
    }
}
