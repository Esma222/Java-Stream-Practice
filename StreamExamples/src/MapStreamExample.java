import java.util.*;

public class MapStreamExample {

    public static void main(String[] args) {
        Map<String,Integer> heights = new HashMap<>();
        heights.put("esma",160);
        heights.put("esra",155);
        heights.put("seda",165);
        heights.put("derya",175);
        heights.entrySet().stream().forEach( height-> System.out.println(height.getValue()));

    }

}
