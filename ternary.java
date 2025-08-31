import java.util.Scanner;
public class ternary{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int max = (a>b)?a:b;
        System.out.println("The Maximum Number Is :" + max);
    }
}