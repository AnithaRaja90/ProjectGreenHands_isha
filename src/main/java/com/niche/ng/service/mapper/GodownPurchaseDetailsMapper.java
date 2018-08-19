package com.niche.ng.service.mapper;

import com.niche.ng.domain.*;
import com.niche.ng.service.dto.GodownPurchaseDetailsDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity GodownPurchaseDetails and its DTO GodownPurchaseDetailsDTO.
 */
@Mapper(componentModel = "spring", uses = {PickListValueMapper.class, GodownMapper.class})
public interface GodownPurchaseDetailsMapper extends EntityMapper<GodownPurchaseDetailsDTO, GodownPurchaseDetails> {

    @Mapping(source = "pickListVariety.id", target = "pickListVarietyId")
    @Mapping(source = "pickListVariety.pickListValue", target = "pickListVarietyPickListValue")
    @Mapping(source = "pickListCategory.id", target = "pickListCategoryId")
    @Mapping(source = "pickListCategory.pickListValue", target = "pickListCategoryPickListValue")
    @Mapping(source = "pickListQuantityType.id", target = "pickListQuantityTypeId")
    @Mapping(source = "pickListQuantityType.pickListValue", target = "pickListQuantityTypePickListValue")
    @Mapping(source = "godown.id", target = "godownId")
    @Mapping(source = "godown.name", target = "godownName")
    GodownPurchaseDetailsDTO toDto(GodownPurchaseDetails godownPurchaseDetails);

    @Mapping(source = "pickListVarietyId", target = "pickListVariety")
    @Mapping(source = "pickListCategoryId", target = "pickListCategory")
    @Mapping(source = "pickListQuantityTypeId", target = "pickListQuantityType")
    @Mapping(source = "godownId", target = "godown")
    GodownPurchaseDetails toEntity(GodownPurchaseDetailsDTO godownPurchaseDetailsDTO);

    default GodownPurchaseDetails fromId(Long id) {
        if (id == null) {
            return null;
        }
        GodownPurchaseDetails godownPurchaseDetails = new GodownPurchaseDetails();
        godownPurchaseDetails.setId(id);
        return godownPurchaseDetails;
    }
}
