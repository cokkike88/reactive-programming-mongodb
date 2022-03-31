package com.poc.reactiveprogrammingmongodb.repositories;

import com.poc.reactiveprogrammingmongodb.models.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends ReactiveMongoRepository<Employee, Integer> {
}
