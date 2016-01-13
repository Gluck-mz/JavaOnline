
public class FileSizeException {
    private int fileSize;

    public FileSizeException(final int fileSize){
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }
}
