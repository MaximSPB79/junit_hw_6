package org.example;

import java.util.List;
import java.util.OptionalDouble;

public class MyList {

    private List<Integer> list1;
    private List<Integer> list2;
    private double averageList1;
    private double averageList2;

    public MyList() {

    }

    public Double getCalculateTheAverageValue (List<Integer> list){
        return list.stream().mapToInt(a -> a).average().orElse(0);
    }

    public MyList(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public double getAverageList1() {
        return averageList1;
    }

    public double getAverageList2() {
        return averageList2;
    }


    public void listComparison(){
        averageList1 = getCalculateTheAverageValue(list1);
        averageList2 = getCalculateTheAverageValue(list2);
        System.out.println("Среднее значение первого списка " + averageList1);
        System.out.println("Среднее значение второго списка " + averageList2);
        if (averageList1 > averageList2){
            System.out.println("Первый список имеет большее среднее значение");
        }else if (averageList1 < averageList2){
            System.out.println("Второй список имеет большее среднее значение");
        }else {
            System.out.println("Средние значения равны");
        }
    }

    public List<Integer> getList1() {
        return list1;
    }

    public List<Integer> getList2() {
        return list2;
    }
}
