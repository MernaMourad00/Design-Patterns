package bridge;

// Refined Abstraction
public class AdvancedMediaPlayer extends MediaPlayer{

    public AdvancedMediaPlayer(Platform platform) {
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
        platform.rewindMedia();
    }
}
