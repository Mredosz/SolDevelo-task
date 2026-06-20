package pl.mateusz.redosz;

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var list = IntStream.rangeClosed(1, 20).boxed().toList();
        alertFunction(list);
    }

    private static void alertFunction(List<Integer> list) {
        for (var num : list){
            if (num % 15 == 0){
                System.out.println("LOWADVISORY");
            } else if (num % 3 == 0){
                System.out.println("LOW");
            } else if (num % 5 ==0) {
                System.out.println("ADVISORY");
            }else System.out.println(num);
        }
    }
}