package adapter.MusicSourceImpl;

import adapter.MusicSource;

public class Tape implements MusicSource {

    private String music;

    public Tape() {
        this.music = "Playing Tape...Hakan Peker - Bir Efsane!!";
    }

    @Override
    public String getMusic() {
        return music;
    }

    @Override
    public void setMusic(String music) {
        this.music = music;
    }

    @Override
    public String getType() {
        return "Tape";
    }
}
