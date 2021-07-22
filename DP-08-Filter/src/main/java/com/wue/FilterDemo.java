package com.wue;

import com.wue.service.Criteria;
import com.wue.service.impl.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FiveMountain
 * @date 2021/7/21 14:50
 */
public class FilterDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new MaleCriteria();
        Criteria female = new FemaleCriteria();
        Criteria single = new SingleCriteria();
        Criteria singleMale = new AndCriteria(male, single);
        Criteria singleOrFemale = new OrCriteria(female, single);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemale: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle: ");
        printPersons(single.meetCriteria(persons));

        System.out.println("\nSingle and Male: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle or Female: ");
        printPersons(singleOrFemale.meetCriteria(persons));

    }

    private static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person: [Name: " + person.getName()
                + ", Gender: " + person.getGender()
                + ", Marital Status: " + person.getMaritalStatus() + "]");
        }
    }
}
