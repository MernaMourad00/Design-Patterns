package factoryPattern;

public class Word implements IFile{
    @Override
    public void delete() {
        System.out.println("deleted by word");
    }

    @Override
    public void open(String fileLocation) {
        System.out.println("opened by word");

    }
}
