
public class PictureFile extends File{
    private String resolution;
    private String color;

    PictureFile(String color, String resolution){
        this.resolution = resolution;
        this.color = color;
    }

    public String getResolution() {
        return resolution;
    }

    public String getColor() {
        return color;
    }
}
