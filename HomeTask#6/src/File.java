
public class File {
    private String name;
    private String format;

    File(String name, String format) throws NullPointerException {
        this.name = name;
        if (name == null){
            throw new NullPointerException("Name of file cannot be empty");
        }
        this.format = format;
        if (format == null){
            throw NullPointerException("Format cannot be empty");
        }
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }
}
