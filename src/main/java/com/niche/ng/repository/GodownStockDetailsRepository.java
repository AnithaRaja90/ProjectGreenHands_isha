package com.niche.ng.repository;

import com.niche.ng.domain.GodownStockDetails;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the GodownStockDetails entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GodownStockDetailsRepository extends JpaRepository<GodownStockDetails, Long> {

}
