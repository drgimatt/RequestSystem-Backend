package com.rijai.LocationApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rijai.LocationApi.model.FormType;

@Repository
public interface FormTypeRepository extends JpaRepository<FormType, Long>{
    
}
