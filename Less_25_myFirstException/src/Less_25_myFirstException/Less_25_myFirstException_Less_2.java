package Less_25_myFirstException;

import java.io.*;
/*
Мультикэтч при обработке исключений. Очередность важна, т.к. одни классы исключений,
являются наследниками других, поэтому сначала идут потомки, затем предки (родительские классы).
В противном случае среда разработки будет ругаться, что логично, родитель может уже обработать
исключение и наследнику работы не достанется (т.е. написан лишний код, который не будет исполнен,
не достигнут - unreached code).
*/
public class Less_25_myFirstException_Less_2 {
    public static void main(String[] args) {
        File take_file = new File("not_find.txt");
        try {
            FileInputStream myFis = new FileInputStream(take_file);
        } catch (NullPointerException e) { // Данный класс наследник RuntimeException
            System.out.println("1.Catch -> " + e);
        } catch (FileNotFoundException e) { // Данный класс наследник IOException
            System.out.println("2.Catch -> " + e);
        }catch (IOException e) { // Данный класс наследник Exception
            System.out.println("3.Catch -> " + e);
        }catch (RuntimeException e) { // Данный класс наследник Exception
            System.out.println("4.Catch -> " + e);
        }catch (Exception e) { // Данный класс наследник Throwable
            System.out.println("5.Catch -> " + e);
        }catch (Throwable e) {
            System.out.println("6.Catch -> " + e);
        } finally {
            System.out.println("Work final block");
        }
    }
}
