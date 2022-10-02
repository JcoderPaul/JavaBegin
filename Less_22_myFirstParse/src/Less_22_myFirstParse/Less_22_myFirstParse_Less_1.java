package Less_22_myFirstParse;

public class Less_22_myFirstParse_Less_1 {
    public static void main(String[] args) {
//*************************************************************************************************
        String num_str = "567";
        int num_from_str = Integer.parseInt(num_str);
        System.out.println("Было String '" + num_str + "' стало int '" + num_from_str + "'");
        /*
        А вот так не прокатит ->

        String num_str_2 = " 56 7";
        int num_from_str_2 = Integer.parseInt(num_str_2);

        будет выброшено исключение ->
        Exception in thread "main" java.lang.NumberFormatException: For input string: " 56 7"
        */

//*************************************************************************************************
        String true_str = "true";
        String false_str_examp = "true sderwfe";
        // Запускается статический метод соответствующего класса
        boolean parce_bool_str = Boolean.parseBoolean(true_str);
        System.out.println(parce_bool_str);
        boolean parce_false_str = Boolean.parseBoolean(false_str_examp);
        System.out.println(parce_false_str); // Не смог спарсить

//*************************************************************************************************
        String doub_str = "34.56";
        double doub_str_parce = Double.parseDouble(doub_str);
        System.out.println(doub_str_parce);
    }
}
