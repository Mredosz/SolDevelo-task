package pl.mateusz.redosz.alert.engine;

import pl.mateusz.redosz.rules.Rule;

import java.util.List;

public class AlertEngine {
    private final List<Rule> rules;

    public AlertEngine(List<Rule> rules) {
        this.rules = rules;
    }

    public String evaluate(int number) {
        var result = new StringBuilder();

        for (var rule : rules) {
            if (rule.matches(number)) {
                result.append(rule.getLabel());
            }
        }

        return result.isEmpty() ? String.valueOf(number) : result.toString();
    }
}
