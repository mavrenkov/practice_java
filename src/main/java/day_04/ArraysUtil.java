package day_04;

import java.util.Arrays;

public class ArraysUtil {

    public static void main(String[] args) {
        //1 toString method
        int[] arr = {1,2,3};

        System.out.println(arr);

        System.out.println(  Arrays.toString(arr)  );

        //2 Equals method
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1, arr2);

        System.out.println(r1);

        //3 Sort method
        int[] arr_not_sorted = {10,88,1,8,5,61, -20};
        Arrays.sort(arr_not_sorted);
        System.out.println(Arrays.toString(arr_not_sorted));


    }

}
