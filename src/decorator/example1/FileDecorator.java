package decorator.example1;

public class FileDecorator implements File{

     File file;

    public FileDecorator(File file) {
        this.file = file;
    }

    @Override
    public String readData() {
        return file.readData();
    }

    @Override
    public void writeData(String data) {
        file.writeData(data);
    }
}
