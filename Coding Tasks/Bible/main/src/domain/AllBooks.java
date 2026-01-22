package domain;

import java.util.ArrayList;
import java.util.List;

public class AllBooks extends CompositeText {
    private final List<Text> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public int getNumberOfWords() {
        return books.stream()
                .mapToInt(Text::getNumberOfWords)
                .sum();
    }

    public List<Verse> getVersesContainingWord(String searchWord) {
        List<Verse> result = new ArrayList<>();
        for(Text book: books){
            result.addAll(book.getVersesContainingWord(searchWord));
        }

        return result;
    }

    @Override
    public List<Text> getChildren() {
        return books;
    }
}
