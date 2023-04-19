package Tasks;

public class Task1 {
    public static void main(String[] args) {
        int [] temp = {70,80,96,73,69,82};
        int lowest=temp[0];
        int highest=temp[0];
        for (int i=0;i< temp.length;i++){
            if (temp[i]>highest){
                highest=temp[i];
            } else if (temp[i]<lowest) {
                lowest=temp[i];
            }
        }
        System.out.println("Highest: "+highest);
        System.out.println("Lowest: "+lowest);
    }
}
