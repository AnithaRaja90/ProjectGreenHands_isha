package com.niche.ng.repository;

import com.niche.ng.domain.NurseryStockDetails;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the NurseryStockDetails entity.
 */
@SuppressWarnings("unused")
@Repository
public interface NurseryStockDetailsRepository extends JpaRepository<NurseryStockDetails, Long> {

}
