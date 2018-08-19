package com.niche.ng.repository;

import com.niche.ng.domain.NurseryStock;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the NurseryStock entity.
 */
@SuppressWarnings("unused")
@Repository
public interface NurseryStockRepository extends JpaRepository<NurseryStock, Long> {

}
