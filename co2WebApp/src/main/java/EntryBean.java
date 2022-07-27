

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class EntryBean implements Serializable{
    private List<Entry> filteredListEntries;

    public void setFilteredListEntries(List<Entry> filteredListEntries)
    {
        this.filteredListEntries = filteredListEntries;
    }
    
    public List<Entry> getFilteredListEntries()
    {
        return filteredListEntries;
    }

    public List<String> getListCountries()
    {
        return EntryFilter.INSTANCE.getListCountries();
    }
}