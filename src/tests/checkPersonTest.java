package tests;

import main.Person;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class checkPersonTest {



    @Test
    public void checkLocalClass(){
        List<Person> listOfPeople = new ArrayList<>();

        listOfPeople.add(new Person("Surb Das", LocalDate.of(2010, Month.APRIL,14),
                        Person.Sex.FEMALE, "qwere@gmail.com"));
        listOfPeople.add(new Person("Alopa Das", LocalDate.of(2012, Month.APRIL,14),
                Person.Sex.FEMALE, "jlsdfj@gmail.com"));
        listOfPeople.add(new Person("Danish Das", LocalDate.of(2022, Month.JANUARY,14),
                Person.Sex.MALE, "qwere@gmail.com"));

                CheckPersonConcrete tester = new CheckPersonConcrete();

                Person.printPerson(listOfPeople,tester);

    }

}