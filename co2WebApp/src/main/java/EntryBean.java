

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named
@ApplicationScoped		//Wichtig - Da bei reinem RequestScope die korrekte ID in der rowExpansion nicht weitergegeben wird
public class EntryBean implements Serializable{
    private List<Entry> filteredListEntries;

    public List<Entry> getFilteredListEntries() {
        return filteredListEntries;
    }

    public void setFilteredListEntries(List<Entry> filteredListEntries) {
        this.filteredListEntries = filteredListEntries;
    }

    public List<String> getListCountries(){
        return EntryFilter.INSTANCE.getListCountries();
    }
}