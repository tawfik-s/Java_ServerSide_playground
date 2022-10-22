package org.example.ManyToOne;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity   //uncomment to test
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Street;
    private String ZipCode;


    @ManyToOne
    //@JoinColumn(name="person_id")
    @JoinTable(name="person_address",joinColumns = {@JoinColumn(name="person_id")},inverseJoinColumns = {@JoinColumn(name="address_id")})
    private Person person;
}
