package Less_11_myStringBuilder;

public class Less_11_StrBuilder_7_NewString {
    public static void main(String[] args) {
        StringBuilder str_sb_1 = new StringBuilder("Доброго дня вам люди!");
        String str_1 = new String(str_sb_1);
        System.out.println(str_1);

        StringBuffer str_sb_2 = new StringBuffer("Всех благ вам селяне!");
        String str_2 = new String(str_sb_2);
        System.out.println(str_2);
    }
}
