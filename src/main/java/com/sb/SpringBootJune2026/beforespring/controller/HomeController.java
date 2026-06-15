package com.sb.SpringBootJune2026.beforespring.controller;

import com.sb.SpringBootJune2026.beforespring.model.Address;
import com.sb.SpringBootJune2026.beforespring.model.Person;
import com.sb.SpringBootJune2026.beforespring.repository.AddressJdbcRepository;
import com.sb.SpringBootJune2026.beforespring.repository.PersonJdbcRepository;

public class HomeController {

    public static void main(String[] args) {

        PersonJdbcRepository personRepo = new PersonJdbcRepository();
        AddressJdbcRepository addressRepo = new AddressJdbcRepository();

        // INSERT OPERATIONS

        addressRepo.saveAddress(new Address(1, "Hyderabad", "Telangana"));
        personRepo.savePerson(new Person(1, "Sai", 24, 1));

        System.out.println("================================");

        // SELECT PERSON
        Person person = personRepo.getPersonById(1);

        if (person != null) {
            System.out.println("Person Details");
            System.out.println("Id      : " + person.getId());
            System.out.println("Name    : " + person.getName());
            System.out.println("Age     : " + person.getAge());
        }

        System.out.println("================================");

        // SELECT ADDRESS
        Address address = addressRepo.getAddressById(1);

        if (address != null) {
            System.out.println("Address Details");
            System.out.println("Id      : " + address.getId());
            System.out.println("City    : " + address.getCity());
            System.out.println("State   : " + address.getState());
        }
    }

}