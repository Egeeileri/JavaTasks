package Tasks;

public class Task8 {
    public static void main(String[] args) {
        int [] array = {12,6,8,9,20,3,7,15};
        int max=array[0];
        int min=array[0];
        for (int i=0;i< array.length;i++){
            if (array[i]>max){
                max=array[i];
            } else if (array[i]<min) {
                min=array[i];
            }
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: " +min);
    }
}
