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

        if (birthday == null) {
            return -1;

        }
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
                ", age=" + getAge() +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }


    //associted with instance
    public void printyBinty(){
        System.out.println(this.toString());

    }


    //associated with the class
    //roster is a scoped var, it only exists w/in scope of this method
    //passing in a concrete CheckPerson
    public static void printPerson(List<Person> roster, CheckPerson bloop) {
            for (Person p : roster) {
                if (bloop.test(p)) {
                    p.printyBinty();
                }
            }




    }



}
