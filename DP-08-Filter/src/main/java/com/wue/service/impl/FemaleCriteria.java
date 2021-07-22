package com.wue.service.impl;

import com.wue.Person;
import com.wue.service.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FiveMountain
 * @date 2021/7/21 14:49
 */
public class FemaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();

        for (Person person : persons) {
            if ("female".equalsIgnoreCase(person.getGender())) {
                femalePersons.add(person);
            }
        }

        return femalePersons;
    }
}
