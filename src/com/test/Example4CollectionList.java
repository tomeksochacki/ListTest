package com.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example4CollectionList {
    public static void main(String[] args) {
        //utworzenie listy i dodanie do niej elemetów
        List<String> stringList = new ArrayList<>();
        stringList.add("Jeden");
        stringList.add("Dwa");
        stringList.add("Trzy");
        stringList.add("Cztery");
        stringList.add(3, "Dwa");
        stringList.add(3,"Pięć");
        stringList.add(4,"Sześć");

        for (String numbers: stringList) {
            System.out.println(numbers);
        }
        //pobranie z listy elementu na odpowiednim indeksie
        System.out.println("In List an position 0 is: " + stringList.get(0));
        System.out.println("In List an position 3 is : " + stringList.get(3));

        //pobranie idneksu danego elementu
        System.out.println("Element 'Trzy' is an position" + stringList.indexOf("Trzy"));
        System.out.println("Element 'Pięć' is an position" + stringList.indexOf("Pięć"));

        //wyświetlenie liczby elementów w liście
        System.out.println("List size is: " + stringList.size());

        //usunięcie z listy elementu "Pięć"
        stringList.remove("Pięć");

        //wyświetlenie elementów listy przy pomocy przeciążonej metody tostring
        System.out.println(stringList.toString());

        
    }
}
