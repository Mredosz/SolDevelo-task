package pl.mateusz.redosz;

import pl.mateusz.redosz.alert.engine.AlertEngine;
import pl.mateusz.redosz.rules.AdvisoryRule;
import pl.mateusz.redosz.rules.LowRule;
import pl.mateusz.redosz.rules.WarnRule;

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var numbers = IntStream.rangeClosed(1, 105).boxed().toList();
        alertFunction(numbers);
    }

    private static void alertFunction(List<Integer> numbers) {
        var rules = List.of(new LowRule(), new AdvisoryRule(), new WarnRule());
        var engine = new AlertEngine(rules);


        for (var num : numbers) {
            System.out.println(engine.evaluate(num));
        }
    }
}