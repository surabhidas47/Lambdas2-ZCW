package main;

public class CheckPersonConcrete implements CheckPerson{


    @Override
    public boolean test(Person p) {
        return (p.getAge()!= -1&& p.getAge()>=10);
    }
}
