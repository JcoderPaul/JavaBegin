package Less_25_myFirstException;

import java.io.*;

/*
Вложенные блоки обработки исключений try-catch-finally
*/
public class Less_25_myFirstException_Less_6 {
    FileInputStream my_fis;
    FileOutputStream my_fos;
    File take_file = new File(".\\src\\data\\file_in.txt");
    File give_file = new File(".\\src\\data\\file_out.txt");

    public static void main(String[] args) {
        Less_25_myFirstException_Less_6 test_catch = new Less_25_myFirstException_Less_6();
        test_catch.workWithFile();
    }

    public void workWithFile() {
        try{
            my_fis = new FileInputStream(take_file);
            System.out.println("Файл file_in.txt найден");
            try {
                my_fos = new FileOutputStream(give_file);
                System.out.println("Файл file_out.txt найден");
            }catch (FileNotFoundException exception_inner){
                System.out.println("Файл file_out.txt не найден " + exception_inner);
            }
        }catch (FileNotFoundException exception_outer){
            System.out.println("Файл file_in.txt не найден " + exception_outer);
        }finally {
            System.out.println("Работает блок finally");
            try {
                my_fos.close();
                my_fis.close();
                System.out.println("Входные и выходные потоки закрыты");
            } catch (IOException exception_in_finally) {
                System.out.println("В блоке finally поймано исключение -> " + exception_in_finally);
            }
        }
    }
}
