package Student;

// Интерфейс с перегруженным методом choiceStud.
public interface CheckStudent {
    boolean choiceStud(Student st, int age_of_stud);

    boolean choiceStud(Student st, char sex_of_stud);

    boolean choiceStud(Student st, double aver_grade_of_stud);

    boolean choiceStud(int course, Student st);
}
