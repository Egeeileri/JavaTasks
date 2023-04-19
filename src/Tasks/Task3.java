package Tasks;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers={
                {1,3,5,7,9},
                {0,2,4,6,8}
        };
        for (int i=0;i< numbers.length;i++){
            for (int j=0;j< numbers[i].length;j++){
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
        }
    }
}
