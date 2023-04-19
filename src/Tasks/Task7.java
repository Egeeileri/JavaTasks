package Tasks;

public class Task7 {
    public static void main(String[] args) {
        int number = 10;
        int first = 0, second = 1, next;

        System.out.print("The first 10 number of Fibonacci Series: ");

        for (int i = 1; i <= number; i++) {
            System.out.print(first+" ");
            if (i != number) {
                System.out.print(", ");
            }
            next = first + second;
            first = second;
            second = next;
        }
    }
}