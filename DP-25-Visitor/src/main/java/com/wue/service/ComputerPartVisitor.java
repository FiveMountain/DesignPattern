package com.wue.service;

import com.wue.service.impl.Computer;
import com.wue.service.impl.Keyboard;
import com.wue.service.impl.Monitor;
import com.wue.service.impl.Mouse;

/**
 * @author FiveMountain
 * @date 2021/7/26 11:01
 */
public interface ComputerPartVisitor {

    /**
     * visit
     * @param computer computer
     */
    void visit(Computer computer);

    /**
     * visit
     * @param keyboard keyboard
     */
    void visit(Keyboard keyboard);

    /**
     * visit
     * @param mouse mouse
     */
    void visit(Mouse mouse);

    /**
     * visit
     * @param monitor monitor
     */
    void visit(Monitor monitor);
}
