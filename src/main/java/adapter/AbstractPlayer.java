package adapter;

import java.util.Objects;

public class AbstractPlayer {
    private String validSourceType;
    private Boolean sourceActive;
    private MusicSource musicSource;

    public AbstractPlayer(String validSourceType) {
        this.validSourceType = validSourceType;
        this.sourceActive = false;
        System.out.println(validSourceType + " player created");
    }

    public void insertMusicSource(MusicSource musicSource) {
        if (Objects.equals(musicSource.getType(), validSourceType)) {
            System.out.println("Valid source:" + validSourceType + " inserted");
            this.sourceActive = true;
            this.musicSource = musicSource;
        }
    }

    public void playMusic() {
        if (this.sourceActive) {
            System.out.println(musicSource.getMusic());
        } else {
            System.out.println("Source not found!!!");
        }
    }
}
