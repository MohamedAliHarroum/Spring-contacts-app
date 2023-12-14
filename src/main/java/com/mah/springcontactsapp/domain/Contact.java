package com.mah.springcontactsapp.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Entity
@Table(name = "contacts")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(NON_NULL)
public class Contact {

    @Id
    @UuidGenerator
    @Column(name = "id", updatable = false, unique = true )
    private  String id;

    private  String name;
    private  String email;
    private  String phone;
    private  String address;
    private  String title;
    private String status;
    private String photoUrl;
}
