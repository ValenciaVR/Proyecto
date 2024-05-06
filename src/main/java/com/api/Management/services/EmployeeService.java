package com.api.Management.services;

import com.api.Management.Models.EmployeeModel;
import com.api.Management.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    //Obtener todos los empleados registrados
    public ArrayList<EmployeeModel> findAllEmployees(){return (ArrayList<EmployeeModel>) employeeRepository.findAll(); }

    //Guardar un empleado
    public EmployeeModel saveEmployee(EmployeeModel client){
        return employeeRepository.save(client);
    }

    //Read Mejorado
    //Buscar por nombre
    public ArrayList<EmployeeModel> findByNameContaining(String name) {
        return employeeRepository.findByNameContaining(name);
    }
    //Buscar por apellido
    public ArrayList<EmployeeModel> findBySurnameContaining(String surname){
        return employeeRepository.findBySurnameContaining(surname);
    }

    //Buscar por id
    public Optional<EmployeeModel> findById(Long id){
        return employeeRepository.findById(id);
    }

    //Eliminar por id
    public String deleteEmployeeById(Long id){

        if(findById(id).isPresent()){
            employeeRepository.deleteById(id);
            return "Empleado borrado...";
        }else {
            return "El empleado con la id="+ id+ " No fue encontrado.";
        }
    }


    //Read
    //Buscar por nombre
    /*public ArrayList<EmployeeModel> findByName(String name){
        return employeeRepository.findByName(name);
    }*/

    //Buscar por apellido
    /*public ArrayList<EmployeeModel> findBySurname(String surname){
        return employeeRepository.findBySurname(surname);
    }*/

    //Buscar por telefono
    /*public ArrayList<EmployeeModel> findByPhone(String phone){
        return employeeRepository.findByPhone(phone);
    }*/

    //Delete Inutil
    //Eliminar por nombre
    /*public void deleteEmployeeByName(String name){
        ArrayList<EmployeeModel> employee = employeeRepository.findByName(name);
        if(!employee.isEmpty()){
            employeeRepository.deleteAll(employee);
        }else{
            throw new IllegalArgumentException("No se encontró ningún cliente con el nombre especificado: "+name);
        }
    }
    //Delete Inutil
    //Eliminar por apellido
    public void deleteClientBySurname(String surname){
        List<EmployeeModel> employee = employeeRepository.findBySurname(surname);
        if(!employee.isEmpty()){
            employeeRepository.deleteAll(employee);
        }else{
            throw new IllegalArgumentException("No se encontró ningún cliente con el apellido especificado: "+surname);
        }
    }*/
}
