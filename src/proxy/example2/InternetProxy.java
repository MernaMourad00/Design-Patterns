package proxy.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InternetProxy implements Internet{

    private List<String> blacklist;
    private RealInternet realInternet;

    public InternetProxy(RealInternet realInternet) {
        this.realInternet = realInternet;
        blacklist = new ArrayList<>();
        blacklist.add("abc.com");
        blacklist.add("merna.com");
    }

    @Override
    public String connectTo(String serverHost) {
        if (blacklist.contains(serverHost)){
            return "cannot connect";
        }
        return realInternet.connectTo(serverHost);

    }
}
