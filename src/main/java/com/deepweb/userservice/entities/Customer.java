package com.deepweb.userservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer extends User {
    private String firstName;
    private String lastName;
    @Transient
    private String fullName;
    private String emailId;
    @Length(max = 10, min = 9)
    private long phoneNumber;
    @Length(min = 1, max = 3)
    private int age;
}
