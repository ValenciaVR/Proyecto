package com.api.Management.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter // Getters y Setters con la dependencia lombok
@Setter
@Entity
@Table(name = "Employees")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)

    private Long id;
    private int age;
    private String name;
    private String surname; //Apellido)
    private String email;
    private String phone; // Teléfono
    private double salary; // salario
    private String role; // Rol en la empresa
    private String department; // Departamento al que pertence
    private String maritalStatus; // Estado civil

}
