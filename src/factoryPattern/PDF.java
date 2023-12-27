package factoryPattern;

public class PDF implements IFile{
    @Override
    public void delete() {
        System.out.println("deleted by PDF");
    }

    @Override
    public void open(String fileLocation) {
        System.out.println("opened by PDF");
    }
}
