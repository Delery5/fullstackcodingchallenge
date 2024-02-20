package com.ibm.delery.employeservice.repository;

import com.ibm.delery.employeservice.entity.Employee;
import com.netflix.appinfo.ApplicationInfoManager;
import jakarta.ws.rs.PathParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;
import java.util.UUID;
//@CrossOrigin("http://localhost:4200")
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

   Optional<Employee>findById(Long Id);

   Optional<Employee> findByEmail(String email);
}

