package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/22 11:18
 */
public class DebugLogger extends AbstractLogger{

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("[DEBUG] " + message);
    }
}
