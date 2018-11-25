package com.epam.onlymyhomework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iter {
    public static void main(String[] args) {
        List<String> cat =new LinkedList<>();

        cat.add("Barsik");
        cat.add("Barsik");
        cat.add("Murzik");
        cat.add("Barsik");

        Iterator<String> iterator =cat.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("Barsik")){
                iterator.remove();
            }
        }
        System.out.println(cat);
    }
}
