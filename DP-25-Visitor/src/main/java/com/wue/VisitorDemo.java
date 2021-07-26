package com.wue;

import com.wue.service.ComputerPart;
import com.wue.service.impl.Computer;
import com.wue.service.impl.ComputerPartDisplayVisitor;

/**
 * @author FiveMountain
 * @date 2021/7/26 11:11
 */
public class VisitorDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
