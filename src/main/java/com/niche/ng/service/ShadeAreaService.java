package com.niche.ng.service;

import com.niche.ng.service.dto.ShadeAreaDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.List;
/**
 * Service Interface for managing ShadeArea.
 */
public interface ShadeAreaService {

    /**
     * Save a shadeArea.
     *
     * @param shadeAreaDTO the entity to save
     * @return the persisted entity
     */
    ShadeAreaDTO save(ShadeAreaDTO shadeAreaDTO);

    /**
     * Get all the shadeAreas.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<ShadeAreaDTO> findAll(Pageable pageable);


    /**
     * Get the "id" shadeArea.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<ShadeAreaDTO> findOne(Long id);

    /**
     * Delete the "id" shadeArea.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

    /**
     * Get the "batchId" shade area record.
     *
     * @param batchId the batchId of the entity
     * @return the list of entity
     */
    List<ShadeAreaDTO> findParticularBatch(Long batchId);
}
