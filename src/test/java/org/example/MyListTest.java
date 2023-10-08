package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MyListTest {

    @Test
    public void checkForCalculationOfCorrectAverageValue() {
        MyList myList = new MyList(List.of(1, 5, 8, 15, 25, 30), List.of(2, 4, 8, 9, 4, 8, 5, 45));
        Assertions.assertEquals(14, myList.getCalculateTheAverageValue(myList.getList1()));
        Assertions.assertEquals(10.625, myList.getCalculateTheAverageValue(myList.getList2()));
    }

    @Test
    public void checkingForCorrectnessOfComparison(){
        MyList myList = new MyList(List.of(1, 5, 8, 15, 25, 30), List.of(2, 4, 8, 9, 4, 8, 5, 45));
        Assertions.assertFalse(myList.getAverageList1() > myList.getAverageList2());
    }

    @Test
    public void equalityTest(){
        MyList myList = new MyList(List.of(1, 5, 8, 15, 25, 30), List.of(2, 4, 8, 9, 4, 8, 5, 45));
        Assertions.assertTrue(myList.getAverageList1() == myList.getAverageList2());
    }
}
