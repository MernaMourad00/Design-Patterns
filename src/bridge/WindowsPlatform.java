package bridge;

// Concrete Implementor: WindowsPlatform
public class WindowsPlatform implements Platform{
    @Override
    public void playMedia(String media) {
        System.out.println(media+" is playing in windows platform");
    }

    @Override
    public void pauseMedia() {
        System.out.println("media is paused in windows platform");
    }

    @Override
    public void rewindMedia() {
        System.out.println("back to the beginning of the media in windows platform");

    }
}
