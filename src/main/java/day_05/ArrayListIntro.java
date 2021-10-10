package day_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(90); //0  autoboxing
        scores.add(80); //1
        scores.add(70); //2
        scores.add(60); //3
        scores.add(50); //4
        scores.add(1,50); //1

        //System.out.println( scores );

        // 100:
        //System.out.println( scores.get(2) );


        //System.out.println( scores.size());

        //set method

       ArrayList<Integer> list1 = new ArrayList<>();
        list1 = scores;
        list1.set( scores.size()-1 , 0);

        //System.out.println(list1);

        //add as List
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(40,50,15,20,90,5,50));

        //Collections util
        Collections.sort(list);
        //System.out.println("list = " + list);
        Collections.swap(list, 1,  2);
        //System.out.println("list = " + list);
        int count =  Collections.frequency(list, 50);
        // maximum number:
        Integer max = Collections.max(list);
        // minimum number:
        Integer min = Collections.min(list);
        //Predicate
       // list.removeIf(  p ->  Collections.frequency(list, p) != 1  ); //make final
        //System.out.println(list);
        //remove/add ALL
        list = null;
        list.addAll(Arrays.asList(1,2,3,4,5));
        list.removeAll(Arrays.asList(3,4,5));
        System.out.println("list = " + list);


    }


}
