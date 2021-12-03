package module3;

public class NameInventer {
    public String invert(String name) {
        if (isEmptyOrSpaces(name)) {
            return "";
        }
        throw new NullPointerException();
    }

    private boolean isEmptyOrSpaces(String name) {
        return name.trim().isEmpty();
    }
}
