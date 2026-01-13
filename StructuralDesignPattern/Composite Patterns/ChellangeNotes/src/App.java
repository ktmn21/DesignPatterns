
public class App {

    public static void main(String[] args) {

        var a = new Note('A');
        var b = new Note('B');
        var c = new Note('C');
        var d = new Note('D');
        var e = new Note('E');
        var f = new Note('F');
        var g = new Note('G');

        var doReMe = new Song();

        doReMe.addNote(c);
        doReMe.addNote(d);
        doReMe.addNote(e);
        doReMe.addNote(c);
        doReMe.addNote(e);
        doReMe.addNote(c);
        doReMe.addNote(e);

        var fa = new Song();
        fa.addNote(c);
        fa.addNote(e);
        fa.addNote(f);

        var sol = new Song();
        sol.addNote(a);
        sol.addNote(c);
        sol.addNote(g);
        sol.addNote(b);

        var compositeSong = new Song();
        compositeSong.addNote(doReMe);
        compositeSong.addNote(fa);
        compositeSong.addNote(sol);
        compositeSong.addNote(a);
        compositeSong.addNote(c);
        compositeSong.addNote(d);

        compositeSong.play();
    }

}
