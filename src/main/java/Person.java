package main.java;

import java.time.LocalDate;
import java.time.Period;

public class Person {



    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;


    public Person( String name,LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday= birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        LocalDate current = LocalDate.now();
        //The Period class provides a way to represent a time span between two dates (years, months, and days)
        Period period = Period.between(birthday, current);
        return period.getYears();

    }
    public Sex getGender() {
        return gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public void printPerson() {
        this.toString();
    }



}
