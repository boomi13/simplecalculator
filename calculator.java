import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Simple calculator");
        System.out.println("1.Adiition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.Division");
         System.out.println("choose your option");
        int choose=sc.nextInt();
        System.out.println("enter your two values");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        switch(choose){
            case 1:
                System.out.println("1.Addition:"+ (a+b));
                break;
            case 2:
                System.out.println("1.Subtraction: "+(a-b));
                break;
            case 3:
                System.out.println("3.multiplication: "+ (a*b));
                break;
            case 4:
                System.out.println("4.Division:"+ (a/b));  
                break;
            default:
                System.out.println("enter valid value");
                break;             
        }
    }
}