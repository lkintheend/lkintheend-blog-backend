/*
 * Created on 2018-10-01 ( Date ISO 2018-10-01 - Time 16:29:37 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.repository;

import com.ifi.entity.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Jpa repository for Catagory.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Repository
public interface CatagoryRepository  extends JpaRepository<Catagory, Integer> {}