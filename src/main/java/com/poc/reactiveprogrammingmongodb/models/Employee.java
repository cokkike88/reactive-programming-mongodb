package com.poc.reactiveprogrammingmongodb.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Employee {
    @Id
    private Integer id;
    private String name;
    private Long salary;
}
