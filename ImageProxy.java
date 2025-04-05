public class ImageProxy implements Image{
    private String name;
    private HighResImage highResImage;
    public ImageProxy(String name){
        this.name = name;
    }
    public void displayThumb(){
        System.out.println("Displaying cached thumbnail for: " + name);
    }
    public void displayFullImage(){
        if(highResImage==null){
            highResImage = new HighResImage(name);
        }
        highResImage.displayFullImage();
    }
}
