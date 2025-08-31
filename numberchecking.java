import java.util.Scanner;
public class numberchecking{
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        int num = input.nextInt();
        if (num > 0){
            System.out.println("THE NUMBER IS POSITIVE");
        } else if (num == 0){
            System.out.println("THE NUMBER IS ZERO");
        } else {
            System.out.println("THE NUMBER IS NEGATIVE");
        }
    }
}