package co2WebApp;
import java.util.ArrayList;
import java.util.Collection;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class Auflistung
{
    private Collection<Staat> staatenArray = new ArrayList<Staat>();

    public Auflistung() {
    	staatenArray.add(new Staat("Deutschland", 2));
    	staatenArray.add(new Staat("Österreich", 33));
    }

    public Collection<Staat> getStaatenArray(){
        return staatenArray;
    }
}
