package myFirstSuperConstructor;

public class myConstructor_HW_1 {
    public static void main(String[] args) {
        Student stud_for_test = new Student(new StringBuilder("Иванов Иван"),3,6);
        stud_for_test.showStudInfo();
        System.out.println("----------------------- Внесли неверные изменения -----------------------");
        // Которые благодаря проверкам не будут зафиксированы
        stud_for_test.getName().append("Иванович");
        stud_for_test.setCours(8);
        stud_for_test.setGrade(21);
        stud_for_test.showStudInfo();
        System.out.println("----------------------- Внесли верные изменения -----------------------");
        // Которые будут зафиксированы
        stud_for_test.setName(new StringBuilder("Сидоров Сидор"));
        stud_for_test.setCours(4);
        stud_for_test.setGrade(8.5);
        stud_for_test.showStudInfo();
    }
}

class Student{
    /*
    String было бы проще, но тогда не было бы возможности показать тонкие моменты
    возможные при работе в геттерах со StringBuilder - ами. У них ведь есть *.append,
    а значит, мы можем без всяких сеттеров курочить содержимое переменной name
    */
    protected StringBuilder name;
    protected int cours;
    protected double grade;

    public Student(StringBuilder name, int cours, int grade) {
        if (name.length() > 3){
        this.name = name;
        }
        if (1 <= cours && cours < 5) {
        this.cours = cours;
        }
        if (1 <= grade && grade <= 10){
        this.grade = grade;
        }
    }

    public StringBuilder getName() {
        /*
        Создали новый билдер, в него зарядили наше имя класса. Если вдруг попадется
        хитрец, который захочет поковырять нашу переменную name, у него получится,
        лишь изменить значение новой переменной substitution (конечно это натянутый
        пример, но все же)
        */
        StringBuilder substitution = new StringBuilder(name);
        return substitution;
    }

    public void setName(StringBuilder name) {
       /*
       Вот пример того, зачем и как применяется инкапсуляция, например, возможность
       проверять вводимые данные на некую валидность (корректность), естественно,
       тут нет else и другого возможного кода, который может расширить функционал
       геттера, сеттера, как и любого другого метода.
       */
       if (name.length() > 3) {
        this.name = name;
       }
    }

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        if (1 <= cours && cours < 5) {
        this.cours = cours;
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (1 <= grade && grade <= 10){
        this.grade = grade;
        }
    }

    public void showStudInfo(){
        System.out.println("Студент: " + name + " курс: " + cours + " оценка: " + grade);
    }
}
