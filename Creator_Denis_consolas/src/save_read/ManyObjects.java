package save_read;
import java.io.*;
import java.util.ArrayList;
 
public class ManyObjects
{
    public static void main(String[] args)
    {
        boolean pisz=true;
        if(args.length>0)
        {
            pisz=false;
        }
        new ManyObjects(pisz);
    }
    //------------------------
    public ManyObjects(boolean pisz)
    {
        if(pisz)
        {
            String plik="Persons.dat";
            ArrayList<Person> persons=new ArrayList<Person>();
            try
            {
                  FileInputStream f=new FileInputStream(plik);
                  ObjectInputStream str=new ObjectInputStream(f);
                  boolean przeczytane=false;
                  while(!przeczytane)
                  {
                        Person p=(Person)str.readObject();
                        if(p==null)
                              przeczytane=true;
                        else
                               persons.add(p);
                   }
                   f.close();
           }
           catch(Exception e)
           {
                  System.out.println(e);
           }
           try
           {
                   FileOutputStream f=new FileOutputStream(plik);
                   ObjectOutputStream str=new ObjectOutputStream(f);
                   str.writeObject(new Person("Kowalski",33));
                   str.writeObject(new Person("Nowak",44));
                   for(int i=0;i<persons.size();i++)
                   {
                       str.writeObject(persons.get(i));
                   }
                   str.flush();
                   f.close();
           }
           catch(Exception e)
           {
                  System.out.println(e);
           }        }
    }
}
//------------------------------------------------
class Person implements Serializable
{
    private String name;
    private int wiek;
    //-----------------------
    Person(String name,int wiek)
    {
        this.name=name;
        this.wiek=wiek;
    }
    //------------------------
    public String getName()
    {
        return name;
    }
}