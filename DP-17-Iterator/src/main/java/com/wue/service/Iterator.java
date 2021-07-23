package com.wue.service;

/**
 * @author FiveMountain
 * @date 2021/7/22 16:35
 */
public interface Iterator {

    /**
     * has next or not
     * @return boolean
     */
    boolean hasNext();

    /**
     * next
     * @return next
     */
    Object next();
}
