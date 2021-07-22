package com.wue.service;

/**
 * @author FiveMountain
 * @date 2021/7/22 15:57
 */
public interface Expression {

    /**
     * interpret
     * @param context context
     * @return boolean
     */
    boolean interpret(String context);
}
