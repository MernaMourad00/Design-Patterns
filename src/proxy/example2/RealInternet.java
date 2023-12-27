package proxy.example2;

public class RealInternet implements Internet{
    @Override
    public String connectTo(String serverHost) {
        String x = "connected to :  "+ serverHost;
        return x;
    }
}
