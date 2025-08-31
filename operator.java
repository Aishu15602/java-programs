import java.util.Scanner;
public class operator{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int operator = input.nextInt();
        switch (operator){
            case 1: System.out.println(a+b); break;
            case 2: System.out.println(a-b); break;
            case 3: System.out.println(a*b); break;
            case 4: System.out.println(a/b); break;
            default: System.out.println("Invalid");
        }
    }
}