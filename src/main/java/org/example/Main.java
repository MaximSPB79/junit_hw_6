package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 5, 8, 15, 25, 30);
        List<Integer> list2 = List.of(2, 4, 8, 9, 4, 8, 5, 45);

        MyList myList = new MyList(list1,list2);

        myList.listComparison();
    }
}