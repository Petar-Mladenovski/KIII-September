package com.KIIISeptember.KIIISeptember.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    private Integer rno;
    private String Name;
    private String Surname;
    private int Age;
}
