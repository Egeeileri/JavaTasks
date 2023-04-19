package Tasks;

public class Task10 {
    public static void main(String[] args) {
        String[] list = {"axx", "sda", "dedw", "qwd", "asd", "rfe", "asd", "cx", "sad", "axx", "cx", "qwd"};
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    System.out.println(list[j]);
                }
            }
        }
    }
}
