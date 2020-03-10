package Lesson3.Homework;

import java.util.HashMap;
import java.util.Map;

public class L3_telephoneBook {
   static HashMap<String, String> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        add("Иванов", "+79098787665");
        add("Иванов", "+79098787666");
        add("Иванов", "+79098787667");
        add("Петров", "+79098787965");
        add("Какойтовч", "+79098787365");

        get("Иванов");

    }



public static void add(String fam, String phone) {
    phoneBook.put(phone,fam);
}

public static void get (String fam) {

    for (Map.Entry<String,String> outArr:phoneBook.entrySet()) {
        if (outArr.getValue().equals(fam)) {
            System.out.println(outArr.getValue() + " : " + outArr.getKey());
        }
    }

}

}
