package pl.mateusz.redosz;

import pl.mateusz.redosz.alert.engine.AlertEngine;
import pl.mateusz.redosz.rules.AdvisoryRule;
import pl.mateusz.redosz.rules.LowRule;
import pl.mateusz.redosz.rules.WarnRule;

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var list = IntStream.rangeClosed(1, 105).boxed().toList();
        alertFunction(list);
    }

    private static void alertFunction(List<Integer> list) {
        var rules = List.of(new LowRule(), new AdvisoryRule(), new WarnRule());
        var alertEngine = new AlertEngine(rules);


        for (var num : list) {
            System.out.println(alertEngine.evaluate(num));
        }
    }
}