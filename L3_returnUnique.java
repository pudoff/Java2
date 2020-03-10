package Lesson3.Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class L3_returnUnique {

    public static void main(String[] args) {
        ArrayList<String> sourceArr = creteArr();
        HashMap<String, Integer> outArr = checkedArr(sourceArr);
        for (Map.Entry<String, Integer> outputArr : outArr.entrySet() ) {
            System.out.println(outputArr.getKey() + " : " + outputArr.getValue());
        }

    }




    public static HashMap<String, Integer> checkedArr (ArrayList<String> incArr) {
        HashMap<String, Integer> preOutArr = new HashMap<>();
        int numIncl = 0;
        for (int i = 0; i < incArr.size(); i++) {
            if (preOutArr.get(incArr.get(i)) == null) {
                preOutArr.put(incArr.get(i), 1);
            } else {
                numIncl = preOutArr.get(incArr.get(i)) +1;
                preOutArr.put(incArr.get(i), numIncl);
            }
        }

        return preOutArr;
    }

    public static ArrayList<String> creteArr() {
        ArrayList<String> newArr = new ArrayList<>();
        newArr.add("Ночь");
        newArr.add("Улица");
        newArr.add("Фонарь");
        newArr.add("Аптека");
        newArr.add("Бессмысленный");
        newArr.add("И");
        newArr.add("Тусклый");
        newArr.add("Свет");
        newArr.add("Живи");
        newArr.add("Еще");
        newArr.add("Хоть");
        newArr.add("Четверть");
        newArr.add("Века");
        newArr.add("Все");
        newArr.add("Будет");
        newArr.add("Так");
        newArr.add("Исхода");
        newArr.add("Нет");
        newArr.add("Нет");
        newArr.add("Нет");
        newArr.add("Аптека");
        newArr.add("Улица");
        newArr.add("Фонарь");
        return newArr;
    };

}
