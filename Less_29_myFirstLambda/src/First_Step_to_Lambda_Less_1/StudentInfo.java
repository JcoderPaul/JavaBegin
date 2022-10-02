package First_Step_to_Lambda_Less_1;

import Student.Student;

import java.util.List;

class StudentInfo {
    void printStudents(Student stud) {
        System.out.println("Имя студента: '" + stud.name +
                "' пол '" + stud.sex +
                "' возраст '" + stud.age +
                "' курс '" + stud.course +
                "' средняя оценка '" + stud.avgGrade + "'");
    }

    void printStudentOverGrade(List<Student> st_list, double avr_for_compare) {
        for (Student st : st_list) {
            if (st.avgGrade > avr_for_compare) {
                printStudents(st);
            }
        }
    }

    void printStudentUnderGrade(List<Student> st_list, double avr_for_compare) {
        for (Student st : st_list) {
            if (st.avgGrade < avr_for_compare) {
                printStudents(st);
            }
        }
    }

    void printStudentOverAge(List<Student> st_list, int age_of_std) {
        for (Student st : st_list) {
            if (st.age > age_of_std) {
                printStudents(st);
            }
        }
    }

    void printStudentUnderAge(List<Student> st_list, int age_of_std) {
        for (Student st : st_list) {
            if (st.age > age_of_std) {
                printStudents(st);
            }
        }
    }

    void printStudentBySex(List<Student> st_list, char std_sex) {
        for (Student st : st_list) {
            if (st.sex == std_sex) {
                printStudents(st);
            }
        }
    }

    void printStudentMultiFilter(List<Student> st_list,
                                 double avg_fo_filter,
                                 int age_for_filter,
                                 char sex_for_filter) {
        for (Student st : st_list) {
            if (st.avgGrade > avg_fo_filter && st.age < age_for_filter && st.sex == sex_for_filter) {
                printStudents(st);
            }
        }
    }
}
