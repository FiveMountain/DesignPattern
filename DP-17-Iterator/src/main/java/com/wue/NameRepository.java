package com.wue;

import com.wue.service.Container;
import com.wue.service.Iterator;

/**
 * @author FiveMountain
 * @date 2021/7/23 13:44
 */
public class NameRepository implements Container {

    public String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }

            return null;
        }
    }
}
