public class Autobus
{
    private String kennzeichen;
    private int sitzplatze;
    private boolean anhanger;
    
    public Autobus(String neuKennzeichen, int neuSitzplatze, boolean neuAnhanger)
    {
        setKennzeichen(neuKennzeichen);
        setSitzplatze(neuSitzplatze);
        setAnhanger(neuAnhanger);
    }
    
    public Autobus()
    {
        setKennzeichen("W-1234A");
        setSitzplatze(29);
        setAnhanger(false);
    }

        
    public String getKennzeichen()
    {
        return kennzeichen;
    }
    
    public int getSitzplatze()
    {
        return sitzplatze;
    }
    
    public boolean getAnhanger()
    {
        return anhanger;
    }
    

    
    
    
    
    
    
    
    
}