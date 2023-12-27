package factoryPattern;

public class fileFactoryImpl implements IfileFactory{
    @Override
    public IFile getFile(String fileType) {
       if (fileType.equals("PDF")){
           return new PDF();
       } else if (fileType.equals("word")) {
           return new Word();
       }
       else return null;
    }
}
