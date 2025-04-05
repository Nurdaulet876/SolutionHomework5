public class MarkerStyle{
    private String type;
    private String color;
    private String labelStyle;
    public MarkerStyle(String type, String color, String labelStyle) {
        this.type = type;
        this.color = color;
        this.labelStyle = labelStyle;
    }
    public void display(int x, int y) {
        System.out.println("Marker at (" + x + ", " + y + ") with icon: " + type
                + ", color: " + color + ", label: " + labelStyle);
    }
}
