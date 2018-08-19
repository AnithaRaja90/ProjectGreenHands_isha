package com.niche.ng.repository;

import com.niche.ng.domain.PickList;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PickList entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PickListRepository extends JpaRepository<PickList, Long> {

}
