package com.poc.reactiveprogrammingmongodb.controllers;

import com.poc.reactiveprogrammingmongodb.models.Employee;
import com.poc.reactiveprogrammingmongodb.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping(path = "/")
    public Mono<Employee> create(@RequestBody Employee employee){
        try{
            return employeeService.create(employee);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @GetMapping(path = "/{id}")
    public Mono<Employee> findById(@PathVariable("id") Integer id){
        return employeeService.findById(id);
    }

    @GetMapping(path = "/")
    public Flux<Employee> findAll(){
        return employeeService.findAll();
    }
}
