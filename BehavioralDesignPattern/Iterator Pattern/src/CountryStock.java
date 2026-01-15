import java.util.Iterator;

public class CountryStock implements Iterator<Country>{

    private final CollectionCountry collectionCountry;
    private int index;

    public CountryStock(CollectionCountry countries){
        this.collectionCountry = countries;
        index = 0;
    }

    @Override
    public boolean hasNext(){
        var items = collectionCountry.getCountries();
        return index < items.length;
    }

    @Override
    public Country next(){
        var countries = collectionCountry.getCountries();
        if(hasNext()){
            return countries[index++];
        }else {
            return null;
        }
    }

}
