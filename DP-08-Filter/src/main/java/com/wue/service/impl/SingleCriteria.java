package com.wue.service.impl;

import com.wue.Person;
import com.wue.service.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FiveMountain
 * @date 2021/7/21 14:57
 */
public class SingleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();

        for (Person person : persons) {
            if ("single".equalsIgnoreCase(person.getMaritalStatus())) {
                singlePersons.add(person);
            }
        }

        return singlePersons;
    }
}
