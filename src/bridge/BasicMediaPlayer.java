package bridge;

public class BasicMediaPlayer extends MediaPlayer{
    public BasicMediaPlayer(Platform platform) {
        super(platform);
    }

    @Override
    public void playMedia(String media) {
        platform.playMedia(media);
    }

    @Override
    public void pauseMedia() {
        platform.pauseMedia();
    }

    @Override
    public void rewindMedia() {
        System.out.println("rewind option isn't available in the basic media player");
    }
}
