package domain;

import java.util.ArrayList;
import java.util.List;

public class Book extends CompositeText {
    private final String title;
    private final List<Text> parts = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addPart(Part part) {
        part.setParent(this);
        parts.add(part);
    }

    @Override
    public List<Text> getChildren() {
        return parts;
    }

    @Override
    public int getNumberOfWords() {
        return getChildren().stream()
                .mapToInt(Text::getNumberOfWords)
                .sum();
    }

    @Override
    public List<Verse> getVersesContainingWord(String word) {
        List<Verse> result = new ArrayList<>();
        for(Text child: parts){
            result.addAll(child.getVersesContainingWord(word));
        }
        return result;
    }
}
