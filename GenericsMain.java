import java.util.ArrayList;

/**
 * Created by William Yu on 9/2/2017.
 */
public class GenericsMain {
    public static void main(String args[]){


        ArrayList<Pet> petList = new ArrayList<>();

        petList.add(new Pet("max"));
        petList.add(new Pet("biscuit"));
        petList.add(new Pet("rover"));
        petList.add(new Pet("doggo"));

        petList.add(new Pet("gambit"));
        petList.add(new Pet("cheeta"));



        System.out.println(petList);



        sortMinToMax(petList);

        System.out.println(petList);
        printList(petList);


    }
    //not used in this exercise
//    public static void printList(Object[] list){
//        for (int i =0; i<list.length; i++)
//            System.out.print(list[i]+" ");
//        System.out.println();
//    }
    public static void printList(ArrayList list){
        for (int i =0; i<list.size(); i++)
            System.out.print(list.get(i)+" ");
        System.out.println();
    }

    public static <E extends Comparable<E>> void sortMinToMax (ArrayList<E> list){
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i< list.size()-1; i++){
            currentMin = list.get(i);
            currentMinIndex = i;

            for (int j = i+1; j < list.size(); j++)
                if (currentMin.compareTo(list.get(j))>0){
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            if (currentMinIndex !=i){
                    list.set(currentMinIndex,list.get(i));
                    list.set(i,currentMin);

            }

        }
    }


    //Not used in this excercise
    public static <E extends Comparable<E>> void sortMinToMax (E[] list){
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i< list.length-1; i++){
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i+1; j < list.length; j++)
                if (list[i].compareTo(list[j])>0){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            if (currentMinIndex !=i){
                    list[currentMinIndex] = list[i];
                    list [i] = currentMin;
            }

        }
    }
}
