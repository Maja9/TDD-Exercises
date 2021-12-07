package module3;

public class NameInventer {
    public String invert(String name) {
        if (StringHelper.isEmptyOrSpaces(name)) {
            return "";
        }
        String[] splitName = name.split(" ");
        return StringHelper.createInvertedString(splitName);
    }


}


