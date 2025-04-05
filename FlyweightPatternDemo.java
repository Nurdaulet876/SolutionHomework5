public class FlyweightPatternDemo {
    public static void main(String[] args) {
        MapMarker[] markers = new MapMarker[10];
        markers[0] = new MapMarker(10, 20, MarkerStyleFactory.getMarkerStyle("Hospital", "Red", "Bold"));
        markers[1] = new MapMarker(50, 60, MarkerStyleFactory.getMarkerStyle("Restaurant", "Blue", "Italic"));
        markers[2] = new MapMarker(30, 40, MarkerStyleFactory.getMarkerStyle("Gas Station", "Green", "Regular"));
        markers[3] = new MapMarker(70, 80, MarkerStyleFactory.getMarkerStyle("Hospital", "Red", "Bold"));
        markers[4] = new MapMarker(90, 100, MarkerStyleFactory.getMarkerStyle("Restaurant", "Blue", "Italic"));

        for(MapMarker marker:markers){
            if(marker!=null){
                marker.display();
            }
        }
        System.out.println("Unique MarkerStyles created: " + MarkerStyleFactory.getStyleCount());
    }
}
