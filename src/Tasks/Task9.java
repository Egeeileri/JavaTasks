package Tasks;

public class Task9 {
    public static void main(String[] args) {
        int [] array = {4,8,12,65,74,34};
        int secLargest=array[0];
        int largest=array[0];
        for (int i=0;i< array.length;i++){
            if (array[i]>largest){
                secLargest=largest;
                largest=array[i];
            }
        }
        System.out.println(secLargest);
    }
}
