import java.util.Iterator;

public class CollectionCountry implements Iterable<Country>{

    private final Country[] countries;

    public CollectionCountry(Country... countries){
        this.countries = countries;
    }

    public Country[] getCountries(){
        return countries;
    }

    @Override
    public Iterator<Country> iterator(){
        return new CountryStock(this);
    }

}
