package Less_14_myFirstArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Задача, создать метод получающий на вход набор однотипных строковых аргументов
и на выходе получить отсортированную коллекцию не повторяющихся элементов.
*/


public class Less_14_ArrayList_13_HW {
    public static void main(String[] args) {
        listMaker("В","лесу","родилась","елочка","в","лесу",
                       "она","росла",",","зимой","и","летом","одним",
                       "цветом","елочка","была");
    }

    public static List<String> listMaker(String...str){
        List<String> out_list = new ArrayList<>();
            for (String arr:str){
                if(!out_list.contains(arr)){
                    out_list.add(arr);
                }
            }
        Collections.sort(out_list);
        System.out.println(out_list);
        return out_list;
    }
}
