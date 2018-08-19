package com.niche.ng.repository;

import com.niche.ng.domain.Godown;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Godown entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GodownRepository extends JpaRepository<Godown, Long> {

}
