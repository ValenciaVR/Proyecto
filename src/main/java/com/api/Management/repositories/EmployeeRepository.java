package com.api.Management.repositories;

import com.api.Management.Models.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {

    //public abstract ArrayList<EmployeeModel> findByName(String name);

    //public abstract ArrayList<EmployeeModel> findBySurname(String surname);

    //public abstract ArrayList<EmployeeModel> findByPhone(String phone);

    ArrayList<EmployeeModel> findByNameContaining(String name);

    ArrayList<EmployeeModel> findBySurnameContaining(String surname);

}
