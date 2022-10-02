package Less_6_myStaticVar;
/*
Если класс это схема будущего объекта, то в этой схеме могут быть элементы
принадлежащие только самому созданному объекту (глубина, ширина, цвет и т.д.)
а могут быть элементы (переменные) принадлежащие самой схеме, классу, не зависимо
от существования созданного объекта. Это переменные с модификатором static.
См. описание и разницу в классах Student и PostgraduateStudent
*/
public class MainStaticApp {

    public static void main(String[] args) {
        Student student_1 = new Student("Vasya Pukin", 1);
        Student student_2 = new Student("Masha Kukina", 2);
        Student student_3 = new Student("Lyapa Mukin", 3);

        System.out.println("********************* Students ********************* ");
        System.out.println("Student -> " + student_1.fullName +
                           " course " + student_1.course +
                           " count of adopted student " + student_1.countOfStud);
        System.out.println("Student -> " + student_2.fullName +
                           " course " + student_2.course +
                           " count of adopted student " + student_2.countOfStud);
        System.out.println("Student -> " + student_3.fullName +
                           " course " + student_3.course +
                           " count of adopted student " + student_3.countOfStud);
        System.out.println("********************* PostGraduateStudents ********************* ");

        PostgraduateStudent postgraduateStudent_1 = new PostgraduateStudent("Gosha Rukin", 2);
        System.out.println("PostGraduateStudent -> " + postgraduateStudent_1.fullName +
                " course " + postgraduateStudent_1.course +
                " count of adopted student " + postgraduateStudent_1.countOfStud);

        PostgraduateStudent postgraduateStudent_2 = new PostgraduateStudent("Dasha Bukina", 1);
        System.out.println("PostGraduateStudent -> " + postgraduateStudent_2.fullName +
                " course " + postgraduateStudent_2.course +
                " count of adopted student " + postgraduateStudent_2.countOfStud);

        PostgraduateStudent postgraduateStudent_3 = new PostgraduateStudent("Yesik Lukin", 1);
        System.out.println("PostGraduateStudent -> " + postgraduateStudent_3.fullName +
                " course " + postgraduateStudent_3.course +
                " count of adopted student " + postgraduateStudent_3.countOfStud);
        System.out.println("********************* Static Magic ********************* ");
        // Мы можем вызывать статическую переменную, как через объект класса, так и из класса
        // напямки, без использования какого бы то ни было объекта см. код ниже.
        System.out.println("Count of adopted PostGraduateStudent : " + PostgraduateStudent.countOfStud);

    }
}
