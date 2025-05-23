package br.com.marlonhenrique7.data.dto;


import org.springframework.hateoas.RepresentationModel;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;


public class PersonDTO extends RepresentationModel<PersonDTO> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;

    public PersonDTO() {
    }

    public PersonDTO(String gender, String address, String lastName, String firstName, Long id) {
        this.gender = gender;
        this.address = address;
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PersonDTO PersonDTO)) return false;
        return Objects.equals(getId(), PersonDTO.getId()) && Objects.equals(getFirstName(), PersonDTO.getFirstName()) && Objects.equals(getLastName(), PersonDTO.getLastName()) && Objects.equals(getAddress(), PersonDTO.getAddress()) && Objects.equals(getGender(), PersonDTO.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getAddress(), getGender());
    }
}
