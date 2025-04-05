import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static Map<String, MarkerStyle> styles = new HashMap<>();
    public static MarkerStyle getMarkerStyle(String type, String color, String labelStyle) {
        String key = type + "_" + color + "_" + labelStyle;
        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(type, color, labelStyle));
            System.out.println("Creating MarkerStyle: " + key);
        }
        return styles.get(key);
    }
    public static int getStyleCount() {
        return styles.size();
    }
}
