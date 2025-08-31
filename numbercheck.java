import java.util.Scanner;
public class numbercheck {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1 == num2){
            System.out.println("BOTH the numbers are same");
        } else {
            System.out.println("THE numbers are different");
        }
    }
}