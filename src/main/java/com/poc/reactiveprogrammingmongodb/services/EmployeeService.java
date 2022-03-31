package com.poc.reactiveprogrammingmongodb.services;

import com.poc.reactiveprogrammingmongodb.models.Employee;
import com.poc.reactiveprogrammingmongodb.repositories.IEmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class EmployeeService {

    private IEmployeeRepository iEmployeeRepository;

    public Mono<Employee> create(Employee employee){
        System.out.println("create service");
        return iEmployeeRepository.save(employee);
    }

    public Mono<Employee> findById(Integer id){
        return iEmployeeRepository.findById(id);
    }

    public Flux<Employee> findAll(){
        return iEmployeeRepository.findAll();
    }
}
