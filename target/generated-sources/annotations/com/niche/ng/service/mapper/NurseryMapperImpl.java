package com.niche.ng.service.mapper;

import com.niche.ng.domain.Nursery;
import com.niche.ng.domain.Sector;
import com.niche.ng.service.dto.NurseryDTO;
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
public class NurseryMapperImpl implements NurseryMapper {

    @Autowired
    private SectorMapper sectorMapper;

    @Override
    public List<Nursery> toEntity(List<NurseryDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Nursery> list = new ArrayList<Nursery>( dtoList.size() );
        for ( NurseryDTO nurseryDTO : dtoList ) {
            list.add( toEntity( nurseryDTO ) );
        }

        return list;
    }

    @Override
    public NurseryDTO toDto(Nursery nursery) {
        if ( nursery == null ) {
            return null;
        }

        NurseryDTO nurseryDTO = new NurseryDTO();

        Long id = nurserySectorId( nursery );
        if ( id != null ) {
            nurseryDTO.setSectorId( id );
        }
        String sectorName = nurserySectorSectorName( nursery );
        if ( sectorName != null ) {
            nurseryDTO.setSectorSectorName( sectorName );
        }
        nurseryDTO.setId( nursery.getId() );
        nurseryDTO.setNurseryName( nursery.getNurseryName() );
        nurseryDTO.setNurseryAddress( nursery.getNurseryAddress() );
        nurseryDTO.setNurseryIncharge( nursery.getNurseryIncharge() );
        nurseryDTO.setStatus( nursery.getStatus() );
        nurseryDTO.setCreatedBy( nursery.getCreatedBy() );
        nurseryDTO.setModifiedBy( nursery.getModifiedBy() );
        nurseryDTO.setCreatedAt( nursery.getCreatedAt() );
        nurseryDTO.setUpdatedAt( nursery.getUpdatedAt() );

        return nurseryDTO;
    }

    @Override
    public List<NurseryDTO> toDto(List<Nursery> nursery) {
        if ( nursery == null ) {
            return null;
        }

        List<NurseryDTO> list = new ArrayList<NurseryDTO>( nursery.size() );
        for ( Nursery nursery1 : nursery ) {
            list.add( toDto( nursery1 ) );
        }

        return list;
    }

    @Override
    public Nursery toEntity(NurseryDTO nurseryDTO) {
        if ( nurseryDTO == null ) {
            return null;
        }

        Nursery nursery = new Nursery();

        nursery.setSector( sectorMapper.fromId( nurseryDTO.getSectorId() ) );
        nursery.setId( nurseryDTO.getId() );
        nursery.setNurseryName( nurseryDTO.getNurseryName() );
        nursery.setNurseryAddress( nurseryDTO.getNurseryAddress() );
        nursery.setNurseryIncharge( nurseryDTO.getNurseryIncharge() );
        nursery.setStatus( nurseryDTO.getStatus() );
        nursery.setCreatedBy( nurseryDTO.getCreatedBy() );
        nursery.setModifiedBy( nurseryDTO.getModifiedBy() );
        nursery.setCreatedAt( nurseryDTO.getCreatedAt() );
        nursery.setUpdatedAt( nurseryDTO.getUpdatedAt() );

        return nursery;
    }

    private Long nurserySectorId(Nursery nursery) {
        if ( nursery == null ) {
            return null;
        }
        Sector sector = nursery.getSector();
        if ( sector == null ) {
            return null;
        }
        Long id = sector.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String nurserySectorSectorName(Nursery nursery) {
        if ( nursery == null ) {
            return null;
        }
        Sector sector = nursery.getSector();
        if ( sector == null ) {
            return null;
        }
        String sectorName = sector.getSectorName();
        if ( sectorName == null ) {
            return null;
        }
        return sectorName;
    }
}
