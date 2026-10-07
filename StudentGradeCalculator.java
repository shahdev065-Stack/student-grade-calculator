import java.util.Scanner;

public class StudentGradeCalculator {
    
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Grade Calculator =====");

        System.out.print("Enter Marks for Maths: ");
        double maths = sc.nextDouble();

        System.out.print("Enter Marks for Java: ");
        double java = sc.nextDouble();

        System.out.print("Enter Marks for DSA: ");
        double dsa = sc.nextDouble();

        System.out.print("Enter Marks for DBMS: ");
        double dbms = sc.nextDouble();

        double total = maths + java + dsa + dbms;

        double percentage = total/4;

        String grade;

        if (maths < 35 || java < 35 || dsa < 35 || dbms < 35) {
            grade = "F";
        } else if (percentage >= 90){
            grade = "A+";

        }else if (percentage >= 90){
            grade = "B+";

        }else if (percentage >= 90){
            grade = "B+";

        }else if (percentage >= 90){
            grade = "A+";

        } else {
            grade = "F";
        }

        System.out.println("\n===== Result =====");
        System.out.println("Total marks: "+ total +" / 500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        if (grade.equals("F")) {
            System.out.println("Result: FAIL");
        } else {
            System.out.println("Result: PASS");
        }

        sc.close();
    }
}