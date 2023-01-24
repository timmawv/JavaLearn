package avlyakulov.timur.epam.chapter_8.example.internationalization.text;

import java.util.Locale;
import java.util.ResourceBundle;

public enum MessageManager {
    EN(ResourceBundle.getBundle("text", new Locale("en", "US"))),
    UA(ResourceBundle.getBundle("text", new Locale("uk", "UA")));
    private ResourceBundle bundle;
    MessageManager(ResourceBundle bundle) {
        this.bundle = bundle;
    }
    public String getString (String key) {
        return bundle.getString(key);
    }
}
