package structuralPatterns.decorator;

public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Write Java code.";
    }
}