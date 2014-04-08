import java.util.*;

public class BarnSet{


    public BarnSet()
    {

    }


    public static void main(String[] argv)
    {
        LinkedList<String> barn = new LinkedList<String>();

        barn.add("Cow");
        barn.add("Horse");
        barn.add("Donkey");
        barn.add("Penguin");
        barn.add("Pig");
        barn.add("Zebra");
        barn.add("Goat");
        barn.add("Koala");
        barn.add("Emu");


        LinkedList<String> barn2 = new LinkedList<String>();

        barn2.add("Penguin");
        barn2.add("Goat");
        barn2.add("Zebra");
        barn2.add("Cow");
        barn2.add("Orangutan");
        barn2.add("Giraffe");
        barn2.add("Alligator");
        barn2.add("Dragon");

        LinkedList<String> intersection = computeIntersection(barn,barn2);
        
        System.out.println("Barn 1 has the following animals");
        print(barn);
        System.out.println("");
        System.out.println("Barn 2 has the following animals");
        print(barn2);
        System.out.println("");
        System.out.println("The intersection is");
        print(intersection);
        
        System.out.println("");
        System.out.println("List A has the fantastic advantage of these animals:");
        print(computeDifference(barn,barn2));
        System.out.println("");
        System.out.println("List B has the awesome collection of animals");
        print(computeDifference(barn2,barn));

    }

    public static LinkedList<String> computeIntersection(LinkedList<String> A, LinkedList<String> B)
    {
       LinkedList<String> intersection = new LinkedList<String>(); 

       for( int i = 0; i <A.size(); i++)
       {
           String item = A.get(i);
           if(B.contains(item))
           {
               intersection.add(item);
           }
       }

       return intersection;
    }
    

    public static LinkedList<String> computeDifference(LinkedList<String> A, LinkedList<String> B)
    {
        LinkedList<String> diff = new LinkedList<String>();
        for(int i =0; i<A.size(); i++)
        {
            String item = A.get(i);
            if(!B.contains(item))
            {
                diff.add(item);
            }
        }
        return diff;
    }


    public static void print(LinkedList<String> list)
    {
        for (int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }

    }

}
