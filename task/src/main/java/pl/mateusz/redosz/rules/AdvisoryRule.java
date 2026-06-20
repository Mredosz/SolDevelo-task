package pl.mateusz.redosz.rules;

public class AdvisoryRule implements Rule{
    @Override
    public boolean matches(int number) {
        return number % 5 == 0;
    }

    @Override
    public String getLabel() {
        return "ADVISORY";
    }
}
