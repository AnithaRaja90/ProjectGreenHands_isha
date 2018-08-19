package com.niche.ng.service.mapper;

import com.niche.ng.domain.*;
import com.niche.ng.service.dto.NurseryStockDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity NurseryStock and its DTO NurseryStockDTO.
 */
@Mapper(componentModel = "spring", uses = {NurseryMapper.class, PickListValueMapper.class})
public interface NurseryStockMapper extends EntityMapper<NurseryStockDTO, NurseryStock> {

    @Mapping(source = "nursery.id", target = "nurseryId")
    @Mapping(source = "nursery.nurseryName", target = "nurseryNurseryName")
    @Mapping(source = "pickListVariety.id", target = "pickListVarietyId")
    @Mapping(source = "pickListVariety.pickListValue", target = "pickListVarietyPickListValue")
    @Mapping(source = "pickListCategory.id", target = "pickListCategoryId")
    @Mapping(source = "pickListCategory.pickListValue", target = "pickListCategoryPickListValue")
    NurseryStockDTO toDto(NurseryStock nurseryStock);

    @Mapping(target = "nurseryStockDetails", ignore = true)
    @Mapping(source = "nurseryId", target = "nursery")
    @Mapping(source = "pickListVarietyId", target = "pickListVariety")
    @Mapping(source = "pickListCategoryId", target = "pickListCategory")
    NurseryStock toEntity(NurseryStockDTO nurseryStockDTO);

    default NurseryStock fromId(Long id) {
        if (id == null) {
            return null;
        }
        NurseryStock nurseryStock = new NurseryStock();
        nurseryStock.setId(id);
        return nurseryStock;
    }
}
