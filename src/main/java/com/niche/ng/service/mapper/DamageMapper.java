package com.niche.ng.service.mapper;

import com.niche.ng.domain.*;
import com.niche.ng.service.dto.DamageDTO;

import org.mapstruct.*;
import java.util.List;
/**
 * Mapper for the entity Damage and its DTO DamageDTO.
 */
@Mapper(componentModel = "spring", uses = {BatchMapper.class})
public interface DamageMapper extends EntityMapper<DamageDTO, Damage> {

    @Mapping(source = "batch.id", target = "batchId")
    @Mapping(source = "batch.batchName", target = "batchBatchName")
    DamageDTO toDto(Damage damage);

    @Mapping(source = "batchId", target = "batch")
    Damage toEntity(DamageDTO damageDTO);

    List<DamageDTO> toDto(List<Damage> damage);

    default Damage fromId(Long id) {
        if (id == null) {
            return null;
        }
        Damage damage = new Damage();
        damage.setId(id);
        return damage;
    }
}
