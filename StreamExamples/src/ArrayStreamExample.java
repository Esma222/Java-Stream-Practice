import java.util.Arrays;

public class ArrayStreamExample {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,3,5,6,6,8,0};
        System.out.println(Arrays.stream(numbers).anyMatch(number-> number<=4));
Arrays.stream(numbers).

    }
}
