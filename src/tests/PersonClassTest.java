package tests;

import main.Person;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static java.time.Month.APRIL;

public class PersonClassTest {

    @Test
    public void checkAge() {

        int expected = 13;
        Person p = new Person ();
        p.setBirthday(2010, APRIL, 24);

        int actual =p.getAge();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkGender() {
        Person.Sex expected = Person.Sex.FEMALE;
        Person p = new Person ();
        p.setGender(expected);

        Person.Sex actual = p.getGender();





    }



}
