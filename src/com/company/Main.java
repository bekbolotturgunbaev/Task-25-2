package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<City> arrayList = new ArrayList<>();
        arrayList.add(new City(1,"Bekbolot"));
        arrayList.add(new City(2,"Alex"));
        arrayList.add(new City(3,"Aida"));
        arrayList.add(new City(4,"Aibek"));
        arrayList.add(new City(5,"Mirel"));
        arrayList.add(new City(6,"Roza"));
        arrayList.add(new City(7,"Aiperi"));
        arrayList.add(new City(8,"Beksultan"));
        arrayList.add(new City(9,"Mariya"));
        arrayList.add(new City(10,"Janadil"));

        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 == 1) {
                System.out.println(arrayList.get(i));
            }
        }
        TreeSet<City> set = new TreeSet<>(Collections.reverseOrder());
        set.addAll(arrayList);
        System.out.println(set);


    }
}
