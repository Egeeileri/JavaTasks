package Tasks;

public class Task2 {
    public static void main(String[] args) {
        int[]array={12,24,6,8,34};
        int sum=0;
        for (int i=0;i< array.length;i++){
            sum=array[i]+sum;
        }
        System.out.println(sum);
    }
}
