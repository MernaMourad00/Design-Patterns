package proxy.example1;

public class NetworkDownloader implements DataSource{
    @Override
    public String downloadFile(String filename) {
        return "downloading ";
    }
}
