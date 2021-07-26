package com.wue.service.impl;

import com.wue.service.ComputerPart;
import com.wue.service.ComputerPartVisitor;

/**
 * @author FiveMountain
 * @date 2021/7/26 11:03
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
