
public class AudioFile extends File{
    private int length;
    private String quality;

    AudioFile(int length, String quality){
        this.length = length;
        this.quality = quality;
    }

    public int getLength() {
        return length;
    }

    public String getQuality() {
        return quality;
    }
}
