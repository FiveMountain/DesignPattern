package com.wue.service;

import com.wue.Person;

import java.util.List;

/**
 * @author FiveMountain
 * @date 2021/7/21 14:49
 */
public interface Criteria {

    /**
     * meetCriteria
     * @param persons persons
     * @return person list
     */
    List<Person> meetCriteria(List<Person> persons);
}
