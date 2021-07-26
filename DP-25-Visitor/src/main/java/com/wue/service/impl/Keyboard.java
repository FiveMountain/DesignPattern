package com.wue.service.impl;

import com.wue.service.ComputerPart;
import com.wue.service.ComputerPartVisitor;

/**
 * @author FiveMountain
 * @date 2021/7/26 11:03
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
