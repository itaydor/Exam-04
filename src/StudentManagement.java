import java.util.ArrayList;
import java.util.Collections;

public class StudentManagement {

    public static void main(String[] args) {
        //a
        System.out.println("A:");
        ArrayList<Student> studentArr = new ArrayList<>();
        studentArr.add(new CommonStudent("Dana Levy", "12345183", 0));
        studentArr.add(new RelativeStudent("Ron Tavor", "01244567", 1));
        studentArr.add(new RelativeStudent("Gal Erez", "5144678", 2));
        studentArr.add(new RelativeStudent("Tal Man", "12322456", 3));
        studentArr.add(new CommonStudent("Ran Gross", "50604561", 60));
        System.out.println("TuitionFees:");
        for (Student student : studentArr) {
            student.tuitionFees();
        }
        //b
        System.out.println("B:");
        System.out.println("Total number of students: " + studentArr.size());
        System.out.println("Common Students: " + CommonStudent.getNumberOfCreations());
        System.out.println("Relative Students: " + RelativeStudent.getNumberOfCreations());
        //c
        System.out.println("C:");
        Collections.sort(studentArr);
        for (Student student : studentArr) {
            System.out.println(student.name);
        }
    }
}
