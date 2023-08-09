package tests;

import main.CheckPerson;
import main.Person;

public class CheckPersonConcrete implements CheckPerson {

    @Override
    public boolean test(Person p) {



        return true;
    }
}
