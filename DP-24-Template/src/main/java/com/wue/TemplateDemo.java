package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/26 10:47
 */
public class TemplateDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
