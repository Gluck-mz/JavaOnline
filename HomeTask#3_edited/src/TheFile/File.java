package TheFile;

import java.util.ArrayList;

public class File{

    public String name;
    public String format;

}

public class TextFile extends File{
    public String font;
    public String size;

}

public class AudioFile extends File{
    public String length;
    public String quality;

}

public class PictureFile extends File{
    public String resolution;
    public String color;

}

Public class Directory{
    ArrayList<File> directory = new ArrayList<File>();
    public void add(File file){
        directory.add(file);
    }
}
