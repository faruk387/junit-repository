package com.myfirstproject;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day05_JavaFaker {
    /*
data : username, password, phone number, test environment, city, ssn, url, job title,..
-Where do you get your test data in your company?
---BA - Business Analyst : writes the Acceptance criteria or requirement
---Test Lead
---Manual Tester
---Tech Lead(Team Lead)
---PO - maintains product backlog
---Developers
---from the database
---from API calls
in addition to all these, we can use java faker if we need some fake data
 */
    @Test
    public void javaFaker(){
        //Create faker object
        Faker faker=new Faker();
        //user faker object or generate fake test data
        String firstName=faker.name().firstName();
        System.out.println("First Name : "+firstName);
        System.out.println("Last Name : "+faker.name().lastName());
        System.out.println("Full Name : "+faker.name().fullName());
        System.out.println("Job title : "+faker.name().title());
        System.out.println("City : "+faker.address().city());
        System.out.println("State : "+faker.address().state());
        System.out.println("Address : "+faker.address().fullAddress());
        System.out.println("Zip Code : "+faker.address().zipCode());
        System.out.println("Random Number : "+faker.number().digits(10));
        System.out.println("Phone Numner : "+faker.phoneNumber().cellPhone());
        System.out.println("SSN : "+faker.idNumber().ssnValid());
        System.out.println("Email : "+faker.internet().emailAddress());
        System.out.println("Birthday : "+faker.date().birthday());



    }
}
