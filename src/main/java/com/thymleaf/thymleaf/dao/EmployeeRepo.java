package com.thymleaf.thymleaf.dao;

import com.thymleaf.thymleaf.entity.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeModel, Long> {
}
