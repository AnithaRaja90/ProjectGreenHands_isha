package com.niche.ng.repository;

import com.niche.ng.domain.GodownStock;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the GodownStock entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GodownStockRepository extends JpaRepository<GodownStock, Long> {

}
