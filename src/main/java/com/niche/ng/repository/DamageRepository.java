package com.niche.ng.repository;

import com.niche.ng.domain.Damage;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * Spring Data  repository for the Damage entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DamageRepository extends JpaRepository<Damage, Long> {
    List<Damage> findByBatchId(Long batchId);
}
