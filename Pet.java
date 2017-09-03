/**
 * Created by William Yu on 9/2/2017.
 */
public class Pet implements Comparable{
    private String name;

    public Pet(){
        name = "No name yet.";
    }
    public Pet(String name){
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }

    public int compareTo(Object anotherPet){


        return getName().toLowerCase().compareTo(((Pet)anotherPet).getName().toLowerCase());
    }
}
