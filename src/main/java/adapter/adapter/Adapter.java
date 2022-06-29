package adapter.adapter;

import adapter.MusicSourceImpl.CD;
import adapter.MusicSourceImpl.Tape;

public class Adapter {
    public static Tape cdToTape(CD cd) {
        Tape tape = new Tape();
        tape.setMusic(cd.getMusic());
        return tape;
    }

    public static CD tapeToCD(Tape tape) {
        CD cd = new CD();
        cd.setMusic(tape.getMusic());
        return cd;
    }
}
