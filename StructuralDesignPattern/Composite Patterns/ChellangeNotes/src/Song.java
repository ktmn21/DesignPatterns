
import java.util.ArrayList;
import java.util.List;

public class Song implements  Playable{
    private final List<Playable> notes = new ArrayList<>();

    public void addNote(Playable note) {
        notes.add(note);
    }

    public List<Playable> getNotes() {
        return notes;
    }

    @Override
    public void play() {
        notes.forEach(Playable::play);
    }
}
