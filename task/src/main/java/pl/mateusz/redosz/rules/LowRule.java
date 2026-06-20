package pl.mateusz.redosz.rules;

public class LowRule implements Rule{
    @Override
    public boolean matches(int number) {
        return number % 3 == 0;
    }

    @Override
    public String getLabel() {
        return "LOW";
    }
}
