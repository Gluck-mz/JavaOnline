
public class TextFile extends File{
    private String font;
    private int size;

    TextFile(String font, int size){
        this.font = font;
        this.size = size;

        if (size < 0){
            throw new FileSizeException(size);
            System.out.println("File size cannot be negative value");
        }

    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

}
