import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by scott_000 on 9/25/2016.
 */
public class Course {

    private String courseName;
    String[] students = new String [100];
    String[] newStudentsArray = new String[students.length * 2];
    private int numberOfStudents;



    public static void copyArray(String[] students, String[] newStudentsArray){
       //copy array to new array
        for (int i = 0; i <= students.length; i++) {
            students[i] = newStudentsArray[i];
        }
    }


    public static void dropStudent(String[] newStudentsArray){
        //find which student should be dropped
        Scanner input = new Scanner(System.in);
        System.out.println("Which student would you like to drop (0 - 100): ");
        int currentStudent = input.nextInt();

        //convert array to list
        List<String> aList = Arrays.asList(newStudentsArray);
        aList.remove(currentStudent);
        aList.toArray(newStudentsArray);

    }

    public static void clearAllStudents(String[] newStudentsArray){
        List<String> aList = Arrays.asList(newStudentsArray);
        aList.clear();
        aList.toArray(newStudentsArray);
    }


    public static void displayStudents(String[] newStudentsArray) {
        for (int i = 0; i<=2; i++) {
            System.out.println(newStudentsArray[i]);
        }
    }

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student){

    }

    public static void  clearStudents(){

    }

}

