import adapter.Adapter;
import adapter.MicroUSB;
import adapter.TypeCCharger;
import adapter.TypeCImp;
import facade.ShopKeeper;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


//--------------------singleton-----------------------------------------

//        Accountant acc = Accountant.getInstance();
//        acc.getInfo();

//------------------------prototype-------------------------------------

//        Registry registry= new Registry();
//        Device d = registry.getClone("tablet");
//        d.displayCharactristics();
//        Device d2 = registry.getClone("laptop");
//        d2.displayCharactristics();

//------------------------builder-------------------------------------

//        IPizzaBuilder pizza = new HawaianPizza();
//        Waiter waiter = new Waiter(pizza);
//        waiter.constructPizza();
//        waiter.getpizzaorder();

//------------------------factory-------------------------------------

//        String fileType= "PDF";
//        String fileType2= "word";
//
//        fileFactoryImpl fileFactory = new fileFactoryImpl();
//        IFile file = fileFactory.getFile(fileType);
//        file.delete();
//
//        IFile file2 = fileFactory.getFile(fileType2);
//        file2.delete();

//------------------------proxy-------------------------------------
// example 1 :

//       NetworkDownloader downloader = new NetworkDownloader();
//        DataSource proxy = new NetworkProxy(downloader);
//        downloadWebsite(proxy);
//        downloadWebsite(downloader);

// example 2 :

//        RealInternet realInternet = new RealInternet();
//        Internet proxy = new InternetProxy(realInternet);
//        System.out.println(proxy.connectTo("merna.com"));
//        System.out.println(proxy.connectTo("aya.com"));

//---------------------decorator---------------------------
// example 1 :

//        File file = new NormalFile();
//        file = new CompressionDecorator(file);
//        System.out.println(file.readData());
//        file = new EncryptionDecorator(file);
//        System.out.println(file.readData());
//
//        file.writeData("okkayyy");

//example 2:

//        Shape circle = new Circle();
//        circle = new RedDecorator(circle);
//        circle.draw();

//---------------------adapter---------------------------

//        TypeCImp typeC = new TypeCImp();
//        MicroUSB microUSB = new MicroUSB();
//        TypeCCharger adapter = new Adapter(microUSB);
//        typeC.chargingTypeC();
//        adapter.chargingTypeC();

//---------------------facade---------------------------

        ShopKeeper shopKeeper = new ShopKeeper();

        shopKeeper.getIphoneInfo();
        shopKeeper.getSamsungInfo();
        shopKeeper.getBlackberryInfo();


    }

    //used for proxy example 1.
//    static void downloadWebsite(DataSource dataSource) {
//        String result = dataSource.downloadFile("google.com");
//        System.out.println("Downloaded: " + result);
//    }

}