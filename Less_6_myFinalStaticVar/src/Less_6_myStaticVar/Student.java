package Less_6_myStaticVar;

public class Student {
    String fullName;
    int course;
    int countOfStud;

    public Student(String fullName, int course) {
        this.fullName = fullName;
        this.course = course;
        // Пытаемся увеличить не статический элемент класса, т.е. оригинальный для каждого
        // экземпляра класса, а это приведет к тому, что значение переменной будет у каждого
        // объекта свое (поскольку дефолтное значение 0, то результат у всех объектов будет 1)
        // И счетчик не будет увеличиваться при создании каждого нового объекта класса Student
        // Вот такой вот счетчик эгоист своего посчитал и ладушки.
        countOfStud++;
    }
}
