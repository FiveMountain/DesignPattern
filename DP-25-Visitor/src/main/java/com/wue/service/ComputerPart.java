package com.wue.service;

/**
 * @author FiveMountain
 * @date 2021/7/26 11:01
 */
public interface ComputerPart {

    /**
     * accept
     * @param computerPartVisitor visitor
     */
    void accept(ComputerPartVisitor computerPartVisitor);
}
