package com.niche.ng.service.mapper;

import com.niche.ng.domain.Batch;
import com.niche.ng.domain.Damage;
import com.niche.ng.service.dto.DamageDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-08-18T19:42:00+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"
)
@Component
public class DamageMapperImpl implements DamageMapper {

    @Autowired
    private BatchMapper batchMapper;

    @Override
    public List<Damage> toEntity(List<DamageDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Damage> list = new ArrayList<Damage>( dtoList.size() );
        for ( DamageDTO damageDTO : dtoList ) {
            list.add( toEntity( damageDTO ) );
        }

        return list;
    }

    @Override
    public DamageDTO toDto(Damage damage) {
        if ( damage == null ) {
            return null;
        }

        DamageDTO damageDTO = new DamageDTO();

        Long id = damageBatchId( damage );
        if ( id != null ) {
            damageDTO.setBatchId( id );
        }
        String batchName = damageBatchBatchName( damage );
        if ( batchName != null ) {
            damageDTO.setBatchBatchName( batchName );
        }
        damageDTO.setId( damage.getId() );
        damageDTO.setNoOfQuantity( damage.getNoOfQuantity() );
        damageDTO.setDescription( damage.getDescription() );
        damageDTO.setDate( damage.getDate() );
        damageDTO.setStatus( damage.getStatus() );
        damageDTO.setCreatedBy( damage.getCreatedBy() );
        damageDTO.setModifiedBy( damage.getModifiedBy() );
        damageDTO.setCreatedAt( damage.getCreatedAt() );
        damageDTO.setUpdatedAt( damage.getUpdatedAt() );

        return damageDTO;
    }

    @Override
    public Damage toEntity(DamageDTO damageDTO) {
        if ( damageDTO == null ) {
            return null;
        }

        Damage damage = new Damage();

        damage.setBatch( batchMapper.fromId( damageDTO.getBatchId() ) );
        damage.setId( damageDTO.getId() );
        damage.setNoOfQuantity( damageDTO.getNoOfQuantity() );
        damage.setDescription( damageDTO.getDescription() );
        damage.setDate( damageDTO.getDate() );
        damage.setStatus( damageDTO.getStatus() );
        damage.setCreatedBy( damageDTO.getCreatedBy() );
        damage.setModifiedBy( damageDTO.getModifiedBy() );
        damage.setCreatedAt( damageDTO.getCreatedAt() );
        damage.setUpdatedAt( damageDTO.getUpdatedAt() );

        return damage;
    }

    @Override
    public List<DamageDTO> toDto(List<Damage> damage) {
        if ( damage == null ) {
            return null;
        }

        List<DamageDTO> list = new ArrayList<DamageDTO>( damage.size() );
        for ( Damage damage1 : damage ) {
            list.add( toDto( damage1 ) );
        }

        return list;
    }

    private Long damageBatchId(Damage damage) {
        if ( damage == null ) {
            return null;
        }
        Batch batch = damage.getBatch();
        if ( batch == null ) {
            return null;
        }
        Long id = batch.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String damageBatchBatchName(Damage damage) {
        if ( damage == null ) {
            return null;
        }
        Batch batch = damage.getBatch();
        if ( batch == null ) {
            return null;
        }
        String batchName = batch.getBatchName();
        if ( batchName == null ) {
            return null;
        }
        return batchName;
    }
}
