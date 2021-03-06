package com.niche.ng.service.mapper;

import com.niche.ng.domain.*;
import com.niche.ng.service.dto.PickListValueDTO;

import org.mapstruct.*;
import java.util.List;
/**
 * Mapper for the entity PickListValue and its DTO PickListValueDTO.
 */
@Mapper(componentModel = "spring", uses = {PickListMapper.class})
public interface PickListValueMapper extends EntityMapper<PickListValueDTO, PickListValue> {

    @Mapping(source = "pickList.id", target = "pickListId")
    @Mapping(source = "pickList.pickListName", target = "pickListPickListName")
    @Mapping(source = "pickValue.id", target = "pickValueId")
    @Mapping(source = "pickValue.pickListValue", target = "pickValuePickListValue")
    PickListValueDTO toDto(PickListValue pickListValue);

    @Mapping(target = "selfIds", ignore = true)
    @Mapping(target = "varietys", ignore = true)
    @Mapping(target = "categorys", ignore = true)
    @Mapping(target = "nurseryStockVarietys", ignore = true)
    @Mapping(target = "nurseryStockCategorys", ignore = true)
    @Mapping(target = "godownPurchaseVarietys", ignore = true)
    @Mapping(target = "godownPurchaseCategorys", ignore = true)
    @Mapping(target = "godownPurchaseQuantityTypes", ignore = true)
    @Mapping(target = "godownStockVarietys", ignore = true)
    @Mapping(target = "godownStockCategorys", ignore = true)
    @Mapping(target = "godownStockQuantityTypes", ignore = true)
    @Mapping(source = "pickListId", target = "pickList")
    @Mapping(source = "pickValueId", target = "pickValue")
    PickListValue toEntity(PickListValueDTO pickListValueDTO);

    List<PickListValueDTO> toDto(List<PickListValue> pickListValue);

    default PickListValue fromId(Long id) {
        if (id == null) {
            return null;
        }
        PickListValue pickListValue = new PickListValue();
        pickListValue.setId(id);
        return pickListValue;
    }
}
