import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetStreamExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1,2,3,4,5,4,3,2,1));
        numbers.add(0);
        numbers.add(3);
        numbers.forEach(System.out::println);//distinct kullanımı herhangibir şey değiştirmiyor.

    }
}
