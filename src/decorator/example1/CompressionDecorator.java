package decorator.example1;

public class CompressionDecorator extends FileDecorator {
    public CompressionDecorator(File file) {
        super(file);
    }
    @Override
    public String readData() {
        return file.readData()+" uncompressed";
    }

    @Override
    public void writeData(String data) {
        file.writeData(data);
        System.out.println("compressed");
    }
}
