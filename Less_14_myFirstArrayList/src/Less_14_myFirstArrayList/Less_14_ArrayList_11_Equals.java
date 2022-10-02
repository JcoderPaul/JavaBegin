package Less_14_myFirstArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Less_14_ArrayList_11_Equals {
    public static void main(String[] args) {
        List<Integer> int_liast_1 = Arrays.asList(2,4,-1,45,23,1,0,45,71);
        List<Integer> int_liast_2 = Arrays.asList(6,21,-34,45,123,1,50,45,71);
        List<Integer> int_liast_3 = int_liast_1;
        List<Integer> int_liast_4 = Arrays.asList(6,21,-34,45,123,1,50,45,71);

        System.out.println(int_liast_1.equals(int_liast_2));
        System.out.println(int_liast_1.equals(int_liast_3));
        System.out.println(int_liast_2.equals(int_liast_3));
        System.out.println(int_liast_4.equals(int_liast_2));

        List<Integer> int_liast_5 = new ArrayList<>();
        int_liast_5.add(6);
        int_liast_5.add(21);
        int_liast_5.add(-34);
        int_liast_5.add(45);
        int_liast_5.add(123);
        int_liast_5.add(1);
        int_liast_5.add(50);
        int_liast_5.add(45);
        int_liast_5.add(71);
        for (Integer list_prn:int_liast_5) {
            System.out.print(list_prn + " ");
        }
        System.out.println();
        System.out.println(int_liast_4);
        System.out.println(int_liast_4.equals(int_liast_5));
    }
}
