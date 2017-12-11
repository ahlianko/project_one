package view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    public View() {
    }
    public static final String MESSAGES_BUNDLE_NAME = "messages";
    public static ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("ua", "Ukraine"));
    public static final String COST_OF_PARK = "park.cost";

    public void printMessage (String message){
        System.out.println(message);
    }
}
