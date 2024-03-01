import java.util.Scanner;
public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Science marks:");
        int Science= sc.nextInt();
        System.out.println("Enter the Social Studies marks:");
        int Social_Studies=sc.nextInt();
        System.out.println("Enter the Mathematics marks:");
        int Mathematics=sc.nextInt();
        System.out.println("Enter the English marks:");
        int English= sc.nextInt();
        System.out.println("Enter the Hindi/Sanskrit marks:");
        int Hindi_or_Sanskrit= sc.nextInt();
        int Total_marks=Science + Social_Studies + Mathematics + English + Hindi_or_Sanskrit;
        System.out.println("Total marks = "+ Total_marks);
        float percentage = Total_marks/5;
        System.out.println("Average Percentage = "+ percentage);
        if(percentage>=90){
            System.out.println("Grade = A");
        } else if (percentage>=80) {
            System.out.println("Grade = B");
        } else if (percentage>=70) {
            System.out.println("Grade = C");
        } else if (percentage>=60) {
            System.out.println("Grade = D");
        }
        else if(percentage>=60){
            System.out.println("Grade = E");
        }
        else if (percentage<=50) {
            System.out.println("Pass");
        } else  {
            System.out.println("Fail");
        }

        }
    }

