package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/22 11:16
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("[ERROR] " + message);
    }
}
