package adapter.MusicSourceImpl;

import adapter.MusicSource;

public class CD implements MusicSource {

    private String music;

    public CD() {
        this.music = "Playing CD...Mustafa Sandal - Onun Arabası Var!!";
    }

    @Override
    public String getMusic() {
        return this.music;
    }

    @Override
    public String getType() {
        return "CD";
    }

    @Override
    public void setMusic(String music) {
        this.music = music;
    }
}
