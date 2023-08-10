package main;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> listOfPeople = new ArrayList<>();

        listOfPeople.add(new Person("Surb Das", LocalDate.of(2010, Month.APRIL,14),
                Person.Sex.FEMALE, "qwere@gmail.com"));
        listOfPeople.add(new Person("Alopa Das", LocalDate.of(2012, Month.APRIL,14),
                Person.Sex.FEMALE, "jlsdfj@gmail.com"));
        listOfPeople.add(new Person("Danish Das", LocalDate.of(2022, Month.JANUARY,14),
                Person.Sex.MALE, "qwere@gmail.com"));
        listOfPeople.add(new Person("Cassadie Andrews ", LocalDate.of(2022, Month.JANUARY,14),
                Person.Sex.MALE, "qwere@gmail.com"));
        listOfPeople.add(new Person());
        listOfPeople.add(new Person("Cassadie Andrews ", LocalDate.of(1950, Month.JANUARY,14),
                Person.Sex.MALE, "qwere@gmail.com"));

         CheckPerson ck = new CheckPersonConcrete();
         Person.printPerson(listOfPeople,ck);
        System.out.println();


        //how i did with anon class
            CheckPerson aCK = new CheckPerson() {
                @Override
                public boolean test(Person p) {
                    return (p.getAge()!= -1&& p.getAge()<=2);
                }
            };

        Person.printPerson(listOfPeople,aCK);
        System.out.println();

        //how i did w/ lambda
        CheckPerson lamb = p -> (p.getAge()!= -1&& p.getAge()>=30);
        Person.printPerson(listOfPeople,lamb);


    }
}
