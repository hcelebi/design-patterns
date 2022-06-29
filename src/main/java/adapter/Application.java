package adapter;

import adapter.MultiMediaPlayerImpl.TapePlayer;
import adapter.MusicSourceImpl.CD;
import adapter.adapter.Adapter;

public class Application {
    public static void main(String[] args) {
        TapePlayer tapePlayer = new TapePlayer();
        tapePlayer.insertMusicSource(Adapter.cdToTape(new CD()));
        tapePlayer.playMusic();
    }
}
