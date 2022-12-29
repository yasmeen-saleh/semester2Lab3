import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int a0[]={1,2,3};
        int a1[]={4,5};
        System.out.println("The merged array is : "+ Arrays.toString(mergingArrays(a0,a1)));
    }
    public static int[] mergingArrays(int array1[], int array2[])
    {int size = (array1.length+array2.length);
        int meredArray[]= new int[size];
        for (int i = 0; i <array1.length ; i++) {
            meredArray[i]=array1[i];
        }
        for (int i = 0; i <array2.length; i++) {
            meredArray[array1.length+i]=array2[i];
        }
        return meredArray;
    }
}