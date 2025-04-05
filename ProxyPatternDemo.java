public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("apartment1.jpg");
        Image image2 = new ImageProxy("apartment2.jpg");

        image1.displayThumb();
        image2.displayThumb();

        System.out.println("User clicks on apartment1.jpg...");
        image1.displayFullImage();

        System.out.println("User clicks on apartment2.jpg...");
        image2.displayFullImage();
    }
}
