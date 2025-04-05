public class HighResImage implements Image{
    private String name;
    public HighResImage(String name){
        this.name = name;
        loadImage();
    }
    private void loadImage(){
        System.out.println("Loading full-resolution images: " + name);
    }
    public void displayThumb(){
        System.out.println("Displaying thumbnail for: " + name);
    }
    public void displayFullImage(){
        System.out.println("Displaying full image for: " + name);
    }
}
