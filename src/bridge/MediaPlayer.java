package bridge;

// Abstraction
public abstract class MediaPlayer {
    protected Platform platform;

    public MediaPlayer(Platform platform) {
        this.platform = platform;
    }

    public abstract void playMedia(String media);
    public abstract void pauseMedia();
    public abstract void rewindMedia();
}
