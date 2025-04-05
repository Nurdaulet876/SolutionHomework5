public class MapMarker{
    private int x;
    private int y;
    private MarkerStyle style;

    public MapMarker(int x, int y, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.style = style;
    }

    public void display() {
        style.display(x, y);
    }
}
