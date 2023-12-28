package bridge;

public class MacPlatform implements Platform{

    @Override
    public void playMedia(String media) {
        System.out.println(media+" is playing in mac platform");
    }

    @Override
    public void pauseMedia() {
        System.out.println("media is paused in mac platform");
    }

    @Override
    public void rewindMedia() {
        System.out.println("back to the beginning of the media in mac platform");

    }
}
