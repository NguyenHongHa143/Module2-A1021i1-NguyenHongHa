package com.example.demo.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Không được để trống")
    @Size(min=5 ,max = 45,message = "Độ dài không hợp lệ")
    private String firstName;
    @NotBlank(message = "Không được để trống")
    @Size(min=5 ,max = 45,message = "Độ dài không hợp lệ")
    private String lastName;
    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "\\d{10}", message = "must be of 10 digit")
    private String phoneNumber;
    @NotBlank(message = "Không được để trống")
    @Email(message = "Sai cấu trúc")
    private String email;

    public User() {
    }

    public User(Long id, String firstName, String lastName, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        String phoneNumber = user.getPhoneNumber();
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "number.empty");
        if (phoneNumber.length()>11||phoneNumber.length()<10){
            errors.rejectValue("phoneNumber","number.length");
        }
        if (!phoneNumber.startsWith("0")){
            errors.rejectValue("phoneNumber","number.startsWith");
        }
        if(!phoneNumber.matches("(^$|[0-9]*$)")){
            errors.rejectValue("phoneNumber","number.matches");
        }
    }
}
