package Students_Details;
import java.util.*;
class Student {
    static String CollegeName = "Bihar National College";

    final int rollNo;
    Student (int rollNo){
        this.rollNo = rollNo;
        noOfStudents +=1;
    }
    Student (){
        rollNo = 0;
        noOfStudents +=1;
    }
    static int noOfStudents = 0;
    void display(){
        System.out.println("------------ " + CollegeName + " ------------ \n" + " \n" + "roll no. : " +
                rollNo + " \n" + "no. of students : " + noOfStudents + " \n" );
    }
}

public class StudentInfo extends Student{
    Scanner sc = new Scanner(System.in);
    StudentInfo (int rollNo, String name, float marks){
        super(rollNo);
        this.name = name;
        this.marks = marks;
    }
    String name;
    float marks;
    void display(){
        super.display();
        System.out.println("name : " + name + "\nmarks : " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String more = "yes";
        while(more.equals("yes")){
            newStudent(sc);
            System.out.println("more students? : ");
            more = sc.next();
        }
        sc.close();
    }
    static ArrayList<Student> students = new ArrayList<>();
    private static void displayAllStudents(){
        System.out.println("------------------------ All Students --------------------------");
        for (Student s : students) {
            s.display();
            System.out.println("----------------------------------------------------------------");
        }
    }

    private static void newStudent(Scanner sc) {

        System.out.println("enter your rollno : ");
        int rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("enter your name : ");
        String name = sc.nextLine();
        System.out.println("enter your marks : ");
        float marks = sc.nextFloat();
        Student student1 = new StudentInfo(rollno, name , marks);
        students.add(student1);
        displayAllStudents();
    }
}
