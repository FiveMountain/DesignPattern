package com.wue;

import java.util.Date;

/**
 * @author FiveMountain
 * @date 2021/7/23 14:14
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
            + " [" + user.getName() + "] : " + message);
    }
}
