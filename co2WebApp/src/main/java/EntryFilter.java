import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum EntryFilter {
    INSTANCE;
    List<String> listCountries = Arrays.asList(
    		"Weltweit", "Deutschland", "Österreich", "Schweiz",
    		"Afghanistan","Albanien","Andorra","Angola","Algerien","Antigua and Barbuda","Argentinien","Armenien", "Australien", "Azerbaijan",
    		"Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgien","Belize","Benin","Bhutan","Bolivien", "Bosnien und Herzegowina","Botswana",
    		"Afghanistan","Albanien","Andorra","Algerien","Antigua and Barbuda","Argentinien","Armenien", "Australien", "Azerbaijan",
    		"Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgien","Belize","Benin","Bhutan","Bolivien", "Bosnien und Herzegowina","Botswana",
    		"Brasilien","Brunei Darussalam","Bulgarien","Burkina Faso","Burundi","Cabo Verde","Chad","Chile","China","Costa Rica","Cote d´Ivoire",
    		"Cuba","Demokratische Repubik Kongo","Denmark","Deutschland","Djibouti","Dominica","Dominikanische Republik","Ecuador","Egypten",
    		"El Salvador","Equatorial Guinea","Eritrea","Estland","Eswatini","Ethiopien","Fiji","Finnland","Frankreich","Gabon","Gambia","Georgien",
    		"Ghana","Grenada","Griechenland","Guatemala","Guinea","Guinea-Bissau","Guyana","Haiti","Honduras","Ungarn","Indien","Indonesien","Iran",
    		"Iraq","Irland","Island","Israel","Italien","Jamaica","Japan","Jordan","Kambodscha","Kamerun","Kamoren","Kanada","Kazakhstan","Kenia","Kirgistan",
    		"Kiribati","Kolumbien","Kroatien","Kuwait","Laos","Latvia","Lesotho","Libanon","Liberia","Liechtenstein","Lithuania","Luxembourg", "Lybien",
    		"Madagascar","Malawi","Malaysia","Malediven","Mali","Malta","Marshall Islands","Mauritania","Mauritius","Mexico","Micronesia","Moldova","Mongolei",
    		"Montenegro","Morocco","Mozambique","Myanmar","Namibia","Nauru","Nepal","Neuseeland","Nicaragua","Niederlande","Niger","Nigeria","Nordkorea",
    		"Nordmazedonien","Norwegen","Oman","Österreich","Pakistan","Palau","Panama","Papua Neu-Guinea","Paraguay","Peru","Philippinen","Polen",
    		"Portugal","Qatar","Republik Kongo","Ruanda","Rumänien","Russland","Samoa","Sao Tome und Principe","Saudi Arabien","Schweden","Schweiz",
    		"Senegal","Serbien","Seychelles","Sierra Leone","Singapur","Slovakei","Slovenien","Solomon Islands","Somalia","Spanien","Sri Lanka",
    		"St. Kitts and Nevis","St. Lucia","St. Vincent and the Grenadines","Südafrika","Sudan","Südkorea","Südsudan","Suriname","Syrien",
    		"Tajikistan","Tanzania","Thailand","Togo","Tonga","Trinidad und Tobago","Tschechien","Tunesien","Türkei","Turkmenistan",
    		"Tuvalu","Uganda","Ukraine","Uruguay","Uzbekistan","Vanuatu","Venezuela","Vereinigte Arabisch Emirate","Vereinigte Staaten","Vereinigtes Königreich",
    		"Vietnam","Weltweit","Yemen","Zambia","Zentralafrikanische Republik","Zypern"
    		); 

    public List<String> getListCountries() {
        return listCountries;
    }
}
