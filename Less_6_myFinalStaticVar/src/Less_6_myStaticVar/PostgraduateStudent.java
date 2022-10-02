package Less_6_myStaticVar;

public class PostgraduateStudent {
    String fullName;
    int course;
    static int countOfStud;

    public PostgraduateStudent(String fullName, int course) {
        this.fullName = fullName;
        this.course = course;
        // Пытаемся увеличить статичный элемент класса, т.е. независимый от экземпляра класса
        // эта переменная может существовать вне созданного объекта и обращаться к ней можно через
        // класс, а не через экземпляр класса (т.е. объект, см. пример в MainApp). Т.е. при
        // создании нового экземпляра класса счетчик будет увеличиваться на 1.
        countOfStud++;
    }
}
