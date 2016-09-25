import java.util.Scanner;

/**
 * Created by scott_000 on 9/25/2016.
 */
public class TestCourse {
    public static void main(String[] args) {
        String[] students = new String [100];
        String[] newStudentsArray = new String[students.length * 2];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 names: ");
        newStudentsArray[0] = input.next();
        newStudentsArray[1] = input.next();
        newStudentsArray[2] = input.next();

        //drop a student
        Course.dropStudent(newStudentsArray);

        //Clear all students
        Course.clearAllStudents(newStudentsArray);

        //Display students
        Course.displayStudents(newStudentsArray);

    }
}
