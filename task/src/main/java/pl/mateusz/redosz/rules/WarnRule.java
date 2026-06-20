package pl.mateusz.redosz.rules;

public class WarnRule implements Rule{
    @Override
    public boolean matches(int number) {
        return number % 7 == 0;
    }

    @Override
    public String getLabel() {
        return "WARN";
    }
}
