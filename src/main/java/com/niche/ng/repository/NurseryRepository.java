package com.niche.ng.repository;

import com.niche.ng.domain.Nursery;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * Spring Data  repository for the Nursery entity.
 */
@SuppressWarnings("unused")
@Repository
public interface NurseryRepository extends JpaRepository<Nursery, Long> {
    List<Nursery> findBySectorId(Long sectorId);
}
