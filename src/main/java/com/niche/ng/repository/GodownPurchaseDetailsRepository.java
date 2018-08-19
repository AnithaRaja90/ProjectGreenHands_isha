package com.niche.ng.repository;

import com.niche.ng.domain.GodownPurchaseDetails;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the GodownPurchaseDetails entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GodownPurchaseDetailsRepository extends JpaRepository<GodownPurchaseDetails, Long> {

}
