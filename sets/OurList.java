public class OurList{
    
    String[] strings = new String[100];
    int numStrings = 0;

    public OurList()
    {
        
    }

    public void add(String s)
    {
        if(numStrings < 100){
            strings[numStrings] = s;
            numStrings++;
        }
    }

    public int size()
    {
        return numStrings;
    }

    public String get(int i )
    {
        return strings[i];
    }

    public boolean contains(String s)
    {
       for(int i =0; i<numStrings; i++)
       {
            if(strings[i].equalsIgnoreCase(s))
            {
                return true;
            }
       }
       return false;
    }
}
