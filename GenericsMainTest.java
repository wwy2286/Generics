import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by William Yu on 9/3/2017.
 */
public class GenericsMainTest {
    @Test
    public void printList() throws Exception {
        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(new Pet("1max"));
        petList.add(new Pet("biscuit"));
        petList.add(new Pet("rover"));
        petList.add(new Pet("doggo"));
        petList.add(new Pet("gambit"));
        petList.add(new Pet("cheeta"));
        GenericsMain.printList(petList);
       System.out.println();


        petList.add(new Pet("gambit"));
        petList.add(new Pet("cheeta"));
        petList.add(new Pet("doggo"));
        petList.add(new Pet("max"));
        petList.add(new Pet("biscuit"));
        petList.add(new Pet("rover"));

        GenericsMain.printList(petList);

    }

    @Test
    public void sortMinToMax() throws Exception {
        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(new Pet("max"));
        petList.add(new Pet("biscuit"));
        petList.add(new Pet("rover"));
        petList.add(new Pet("doggo"));
        petList.add(new Pet("gambit"));
        petList.add(new Pet("cheeta"));
        GenericsMain.sortMinToMax(petList);
        GenericsMain.printList(petList);
        Assert.assertEquals("First Object","biscuit",petList.get(0).getName());
        Assert.assertEquals("First Object","cheeta",petList.get(1).getName());
        Assert.assertEquals("First Object","doggo",petList.get(2).getName());
        Assert.assertEquals("First Object","gambit",petList.get(3).getName());
        Assert.assertEquals("First Object","max",petList.get(4).getName());
        Assert.assertEquals("First Object","rover",petList.get(5).getName());

        ArrayList<Pet> petList1 = new ArrayList<>();
        petList1.add(new Pet("rocker"));
        petList1.add(new Pet("snack"));
        petList1.add(new Pet("treat"));
        petList1.add(new Pet("rabbit"));
        petList1.add(new Pet("bobo"));
        GenericsMain.sortMinToMax(petList1);
        GenericsMain.printList(petList1);
        Assert.assertEquals("First Object","bobo",petList1.get(0).getName());
        Assert.assertEquals("First Object","rabbit",petList1.get(1).getName());
        Assert.assertEquals("First Object","rocker",petList1.get(2).getName());
        Assert.assertEquals("First Object","snack",petList1.get(3).getName());
        Assert.assertEquals("First Object","treat",petList1.get(4).getName());


    }

}