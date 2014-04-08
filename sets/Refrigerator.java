public class Refrigerator{

    public Refrigerator(){

    }
    

    public static void main(String[] args)
    {
        OurList fridge = new OurList();
        fridge.add("Pasta");
        fridge.add("Spinach");
        fridge.add("Pineapple");
        fridge.add("Tofu");
        fridge.add("Avacado");
        fridge.add("Strawberries");

        OurList freezer = new OurList();
        freezer.add("Cat");
        freezer.add("Peas");
        freezer.add("Popsicle");
        freezer.add("Spinach");
        freezer.add("Ice");
        freezer.add("Frozen Pizza");
        freezer.add("Tofu");
        freezer.add("Corn");
        freezer.add("Ice Cream");
        freezer.add("Waffles");

        System.out.println("The fridge is filled with:");
        print(fridge);
        System.out.println("\nThe Freeze is filled with:");
        print(freezer);
        System.out.println("\nItems that are redundant are:");
        print(computeIntersection(fridge,freezer));

    }

    public static OurList computeIntersection(OurList A, OurList B)
    {
        OurList duplicates = new OurList();
        
        for(int i = 0; i<A.size(); i++)
        {
            String s = A.get(i);
            if(B.contains(s))
            {
                duplicates.add(s);
            }
        }
        return duplicates;
    }


    public static void print(OurList A)
    {
        for(int i = 0; i<A.size(); i++)
        {
            System.out.println(A.get(i));
        }
    }


}
