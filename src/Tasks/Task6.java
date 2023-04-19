package Tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input a number ");
        int number= input.nextInt();
        boolean prime = true;
        for (int i=2;i<number;i++){
            if (number % i == 0){
                prime = false;
                break;
            }
        }
        if (prime == true && number>1){
            System.out.println("Prime ");
        }else {
            System.out.println("Not Prime");
        }
    }
}
