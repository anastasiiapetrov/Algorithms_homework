import java.util.Arrays;

public class Task_2 {
    public static void sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr).toUpperCase());
    }

    public static void main(String[] args) {
        String s = "poiuytrewqlkjhgfdsamnbvcxz";
        sortString(s);
    }
}
