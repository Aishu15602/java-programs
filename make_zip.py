import zipfile

# Un programs dictionary
programs = {
    "leapyear.java": """import java.util.Scanner;
public class leapyear{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if((num%100==0 && num%400==0)||(num%100!=0 && num%4==0)){
            System.out.println("The year is leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
}""",

    "atm.java": """import java.util.Scanner;
public class atm{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch(num){
            case 1: System.out.println("Balance Check"); break;
            case 2: System.out.println("Deposit"); break;
            case 3: System.out.println("Withdrawal"); break;
            case 4: System.out.println("Thank you bye bye!"); break;
            default: System.out.println("Enter 1 to 3 for banking or 4 for exits");
        }
    }
}""",

    "age.java": """import java.util.Scanner;
public class age{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age>=1 && age<=10){
            System.out.println("Child");
        }
        else if (age>=11 && age<=18){
            System.out.println("Teenagers");
        }
        else if(age>=19 && age<=25){
            System.out.println("Youngsters");
        }
        else if(age>=26 && age<=50){
            System.out.println("Middle Agers");
        }
        else{
            System.out.println("Old Agers");
        }
    }
}"""
}

# Zip file create pannu
with zipfile.ZipFile("java_programs.zip", "w") as zipf:
    for filename, code in programs.items():
        zipf.writestr(filename, code)

print("✅ java_programs.zip created successfully!")
