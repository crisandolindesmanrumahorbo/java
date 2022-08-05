package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> stringLambda = new ArrayList<>();

        strings.add("e");
        stringLambda.add("f");

        //lamba
        stringLambda = stringLambda.stream().map(s -> s + "rick").collect(Collectors.toList()); 

        //stream
        strings = strings.stream().map(LambdaMain::plus).collect(Collectors.toList());

        System.out.println(stringLambda.get(0));
        System.out.println(strings.get(0));
    }

    private static String plus(String s) {
        return s + "quity";
    }
}
