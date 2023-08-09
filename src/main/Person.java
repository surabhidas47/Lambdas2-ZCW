package main;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

public class Person {
    public enum Sex {
        MALE, FEMALE;
    }


    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person() {
        this("name", null, null, null);
    }

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday= birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public void setBirthday(int year, Month month, int dayOfMonth) {
        birthday = LocalDate.of(year, month,dayOfMonth);
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

    public void setGender(Sex gender) {
        this.gender = gender;
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


    //associted with instance
    public void printPerson(){
        System.out.println(this.toString());

    }


    //associated with the class
    public static void printPerson(List<Person> roster, CheckPerson tester) {
            for (Person p : roster) {
                if (tester.test(p)) {
                    p.printPerson();
                }
            }




    }



}
