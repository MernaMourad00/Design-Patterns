package decorator.example1;

public class NormalFile implements File{
    @Override
    public String readData() {
        return "reading normal data";
    }

    @Override
    public void writeData(String data) {
        System.out.println( "data written: "+data);
    }
}
