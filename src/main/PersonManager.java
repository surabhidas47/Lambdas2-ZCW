package main;

import java.util.ArrayList;
import java.util.List;

public class PersonManager extends ArrayList<Person> implements CheckPerson{





    @Override
    public boolean test(Person p) {
        return false;
    }
}

