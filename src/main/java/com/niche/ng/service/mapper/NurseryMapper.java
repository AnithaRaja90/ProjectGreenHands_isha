package com.niche.ng.service.mapper;

import com.niche.ng.domain.*;
import com.niche.ng.service.dto.NurseryDTO;

import org.mapstruct.*;
import java.util.List;

/**
 * Mapper for the entity Nursery and its DTO NurseryDTO.
 */
@Mapper(componentModel = "spring", uses = {SectorMapper.class})
public interface NurseryMapper extends EntityMapper<NurseryDTO, Nursery> {

    @Mapping(source = "sector.id", target = "sectorId")
    @Mapping(source = "sector.sectorName", target = "sectorSectorName")
    NurseryDTO toDto(Nursery nursery);

    List<NurseryDTO> toDto(List<Nursery> nursery);

    @Mapping(target = "batchs", ignore = true)
    @Mapping(target = "nurseryStocks", ignore = true)
    @Mapping(source = "sectorId", target = "sector")
    Nursery toEntity(NurseryDTO nurseryDTO);

    default Nursery fromId(Long id) {
        if (id == null) {
            return null;
        }
        Nursery nursery = new Nursery();
        nursery.setId(id);
        return nursery;
    }
}
