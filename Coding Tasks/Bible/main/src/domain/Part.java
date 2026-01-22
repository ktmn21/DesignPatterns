package domain;

import java.util.ArrayList;
import java.util.List;

public class Part extends CompositeText {
    private Book parent;
    private final int number;
    private final List<Text> verses = new ArrayList<>();

    public Part(int number) {
        this.number = number;
    }

    public void setParent(Book parent) {
        this.parent = parent;
    }

    public Book getParent(){
        return this.parent;
    }

    public int getNumber() {
        return number;
    }

    public void addVerse(Verse verse) {
        verse.setParent(this);
        verses.add(verse);
    }

    @Override
    public List<Text> getChildren() {
        return verses;
    }

    @Override
    public int getNumberOfWords() {
        return getChildren().stream()
                .mapToInt(Text::getNumberOfWords)
                .sum();
    }

    @Override
    public List<Verse> getVersesContainingWord(String word) {
        List<Verse> verses1 = new ArrayList<>();
        for(Text child: verses){
            verses1.addAll(child.getVersesContainingWord(word));
        }
        return verses1;
    }
}
