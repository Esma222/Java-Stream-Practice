import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListStreamExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("esma","esra","sema","semra","serra");
        Stream<String> filteredNamesStream = names.stream().filter(name -> name.length() > 4);
        filteredNamesStream.forEach(System.out::println);
        //names.stream().filter(name -> name.length() > 4).sorted().forEach(System.out::println);


    }

}
