package com.wue.service.impl;

import com.wue.Person;
import com.wue.service.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FiveMountain
 * @date 2021/7/21 14:50
 */
public class MaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        ArrayList<Person> malePersons = new ArrayList<>();

        for (Person person : persons) {
            if ("male".equalsIgnoreCase(person.getGender())) {
                malePersons.add(person);
            }
        }

        return malePersons;
    }
}
