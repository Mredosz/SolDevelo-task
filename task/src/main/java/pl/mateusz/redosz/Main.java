package pl.mateusz.redosz;

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var list = IntStream.rangeClosed(1, 20).boxed().toList();
        alertFunction(list);
    }

    private static void alertFunction(List<Integer> list) {
        for (var num : list) {
            var output = "";
            if (num % 3 == 0) {
                output += "LOW";
            }

            if (num % 5 == 0) {
                output += "ADVISORY";
            }

            if (output.isEmpty()) {
                output = num.toString();
            }

            System.out.println(output);
        }
    }
}