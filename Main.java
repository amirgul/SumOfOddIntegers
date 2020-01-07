import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("this program will compute positive odd integers");
        System.out.println("please enter the numbers");
        int number = keyboard.nextInt();
        double sum = 0;
        double value = 0;
        for(int i = 0; i<number; i++ )
        {
            value = ((i+i) +1);
            System.out.println("odd is: " + value);
            sum = sum + value;
        }
        System.out.println("the sum of first: " + number +" is: ");
        System.out.print(sum);
    }
}
