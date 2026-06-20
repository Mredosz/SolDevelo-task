package pl.mateusz.redosz.rules;

public interface Rule {
    boolean matches(int number);
    String getLabel();
}
