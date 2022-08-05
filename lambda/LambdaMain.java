package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("e");


        strings = strings.stream().map(LambdaMain::plus).collect(Collectors.toList());

        System.out.println(strings.get(0));
    }

    private static String plus(String s) {
        return s + "quity";
    }
}
