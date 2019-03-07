import java.util.ArrayList;
import java.util.List;

public class GitTest{
    public static void main(String[] args) {
        // Test git&lambda
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("s");
        list.add("d");
        list.add("f");
        // lambda
        list.forEach(System.out::println);
//        list.forEach(s -> System.out.println(s));
    }
}