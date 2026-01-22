package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Verse implements Text {
    private Part parent;
    private final int number;
    private final String content;
    private final List<String> listOfWords;

    public Verse(int number, String content) {
        this.number = number;
        this.content = content;
        this.listOfWords = getListOfWords(content);
    }

    public String getContent() {
        return content;
    }

    public int getNumber() {
        return number;
    }

    public void setParent(Part parent) {
        this.parent = parent;
    }

    public String format() {
        // To be implemented
        // book name, part number and verse number. See example:
        // Genesis 2,13 "I have set my rainbow in the clouds"
        var bookName = parent.getParent().getTitle();
        var partNumber = parent.getNumber();
        return String.format("%s %d,%d \"%s\"", bookName, partNumber, getNumber(), content);

    }

    @Override
    public int getNumberOfWords() {
        return listOfWords.size();
    }

    @Override
    public List<Verse> getVersesContainingWord(String word) {
        if(listOfWords.contains(word)){
            return List.of(this);
        }else {
            return List.of();
        }
    }

    private List<String> getListOfWords (String content){
        List<String>  punctuationChars = new ArrayList<>(List.of(",", ".", "!", "?", "", ";"));

        return Arrays.stream(content.split(" "))
                .filter(w -> !punctuationChars.contains(w))
                .collect(Collectors.toList());
    }

}
