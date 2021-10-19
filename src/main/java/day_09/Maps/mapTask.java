package day_09.Maps;

import java.util.Map;
import java.util.TreeMap;

//print only students that have score<80
public class mapTask {
    public static void main(String[] args) {

        Map<String, Double> score = new TreeMap<>();
        score.put("student_1", 99.9);
        score.put("student_2", 100.0);
        score.put("student_3", 0.09);
        score.put("student_4", 100000.99);
        score.put("student_5", 66.66);


    }
}

