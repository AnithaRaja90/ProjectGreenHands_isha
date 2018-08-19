package com.niche.ng.repository;

import com.niche.ng.domain.ShadeArea;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * Spring Data  repository for the ShadeArea entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ShadeAreaRepository extends JpaRepository<ShadeArea, Long> {
    List<ShadeArea> findByBatchId(Long batchId);
}
