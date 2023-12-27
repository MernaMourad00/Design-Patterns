package proxy.example1;

import java.util.HashMap;
import java.util.Map;

public class NetworkProxy implements DataSource{

    private Map<String,String> visitedWebsites;
    private NetworkDownloader networkDownloader;

    public NetworkProxy(NetworkDownloader networkDownloader) {
        this.networkDownloader = networkDownloader;
        visitedWebsites = new HashMap<>();
    }

    @Override
    public String downloadFile(String fileUrl) {
        if(visitedWebsites.containsKey(fileUrl)){
            return visitedWebsites.get(fileUrl);
        }
        String file = networkDownloader.downloadFile(fileUrl);
        visitedWebsites.put(fileUrl,file);


        return file;
    }
}
