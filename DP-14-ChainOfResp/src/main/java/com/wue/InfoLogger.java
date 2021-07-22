package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/22 11:15
 */
public class InfoLogger extends AbstractLogger{

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("[INFO] " + message);
    }
}
