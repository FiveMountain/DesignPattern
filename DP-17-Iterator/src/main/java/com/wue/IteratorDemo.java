package com.wue;

import com.wue.service.Iterator;

/**
 * @author FiveMountain
 * @date 2021/7/23 13:48
 */
public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = new NameRepository().getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("name = " + name);
        }
    }
}
