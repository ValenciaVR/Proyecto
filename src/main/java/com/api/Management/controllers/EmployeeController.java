package com.api.Management.controllers;

import com.api.Management.Models.EmployeeModel;
import com.api.Management.repositories.EmployeeRepository;
import com.api.Management.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    //Get
    //Obtener los empleados
    @GetMapping
    public ArrayList<EmployeeModel> findAllEmployees(){
        return employeeService.findAllEmployees();
    }

    //Post
    //Enviar empleados
    @PostMapping
    public EmployeeModel saveEmployee(@RequestBody EmployeeModel employee){
        return employeeService.saveEmployee(employee);
    }

    //Update
    //Editar
    @PutMapping
    public EmployeeModel updateEmployee(@RequestBody EmployeeModel employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/find-by-name-containing")
    public ArrayList<EmployeeModel> findByNameContaining(@RequestParam("name") String name) {
        return employeeService.findByNameContaining(name);
    }

    @GetMapping("/find-by-surname-containing")
    public ArrayList<EmployeeModel> findBySurnameContaining(@RequestParam("surname") String surname){
        return employeeService.findBySurnameContaining(surname);
    }

    //Borrar por id
    @DeleteMapping("/delete-by-id")
    public String deleteEmployeeById(@RequestParam("id") Long id){
        return employeeService.deleteEmployeeById(id);
    }

    //buscar por id
    @GetMapping(path = "/find-by-id")
    public Optional<EmployeeModel> findById(@RequestParam("id")Long id){
        return employeeService.findById(id);
    }

    //Read
    //buscar por nombre
    /*@GetMapping(path = "/find-by-name") //localhost:8080/client/find-by-name?
    public ArrayList<EmployeeModel> findByName(@RequestParam("name")String name){
        return employeeService.findByName(name);
    }

    //buscar por apellido
    @GetMapping(path = "/find-by-surname")
    public ArrayList<EmployeeModel> findBySurname(@RequestParam("surname")String surname){
        return employeeService.findBySurname(surname);
    }*/



    //Delete
    //borrar cliente por nombre
    /*@DeleteMapping(path = "/delete-by-name")
    public void deleteEmployeeByName(@RequestParam("name")String name){
        employeeService.deleteEmployeeByName(name);
    }

    //borrar cliente por apellido
    @DeleteMapping(path = "/delete-by-surname")
    public void deleteEmployeeBySurname(@RequestParam("surname")String surname){
        employeeService.deleteClientBySurname(surname);
    }*/




}
