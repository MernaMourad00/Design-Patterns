package decorator.example1;

public class EncryptionDecorator extends FileDecorator{
    public EncryptionDecorator(File file) {
        super(file);
    }




    @Override
    public String readData() {
        return file.readData()+" decrypted";
    }

    @Override
    public void writeData(String data) {
       file.writeData(data);
        System.out.println(" encrypted");
    }
}
