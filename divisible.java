import java.util.Scanner;
public class divisible{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%3==0 && num%4==0){
            System.out.println("The Number Is Divisible By Both 3 and 4");
        } else {
            System.out.println("The Number Is Not Divisible By Both 3 and 4");
        }
    }
}