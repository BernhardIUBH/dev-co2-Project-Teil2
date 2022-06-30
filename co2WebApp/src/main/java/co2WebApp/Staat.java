package co2WebApp;

public class Staat
{
    private String laenderName;
    private int co2wert;

    public Staat(String laenderName, int co2wert)
    {
        this.laenderName = laenderName;
        this.co2wert = co2wert;
    }

    public String getLaenderName()
    {
        return laenderName;
    }

    public int getCo2wert()
    {
        return co2wert;
    }
}
