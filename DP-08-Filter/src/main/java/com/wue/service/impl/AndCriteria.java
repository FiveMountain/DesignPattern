package com.wue.service.impl;

import com.wue.Person;
import com.wue.service.Criteria;

import java.util.List;

/**
 * @author FiveMountain
 * @date 2021/7/21 14:49
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPerssons = criteria.meetCriteria(persons);

        return otherCriteria.meetCriteria(firstCriteriaPerssons);
    }
}
