import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(1,"Esma"));
        users.add(new User(2,"Esra"));
        users.add(new User(3,"Sema"));
        users.add(new User(4,"Seda"));
        users.add(new User(5,"Sare"));
        users.add(new User(6,"Serra"));

        users.stream().forEach(user -> {
            System.out.println("JAVA8");
            System.out.println(user.toString());
        });

        List<User> filteredList = users.stream().filter(user -> user.getId() < 4).collect(Collectors.toList());
        System.out.println("filteredList");
        filteredList.stream().forEach(user -> user.talk());
        System.out.println("mappedList");
        List<User> mappedList = users.stream().map(user -> new User(user.getId() + 200, user.getName())).collect(Collectors.toList());
        mappedList.stream().forEach(user -> System.out.println(user.toString()));

        Map<Integer, String> map = mappedList.stream().collect(Collectors.toMap(user -> user.getId(), user -> user.getName()));
        map.forEach((key ,value)-> System.out.println(key +" : "+ value));

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Stream<Integer> nameLengths = names.stream().map(String::length);
        nameLengths.forEach(namelength-> System.out.println(namelength));
        // aynı stream üzerinden ikinci terminal çalıştırılmasına izin verilmez
        // nameLengths.forEach(namelength-> System.out.println(namelength));

        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        numbers.stream().forEach(number-> System.out.println(number));
        Stream<Integer> flattenedNumbers = numbers.stream().flatMap(List::stream);
        flattenedNumbers.forEach(stream-> System.out.println(stream));

        Stream<Integer> namesSecondIndex = names.stream().map(String::hashCode);
        namesSecondIndex.forEach(namelength-> System.out.println(namelength));




    }

}

class User{

    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void talk(){
        System.out.println("Hi! My name is "+getName());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
