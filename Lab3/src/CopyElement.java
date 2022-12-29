import java.util.Arrays;

public class CopyElement {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        Student s1= new Student(1,"sara");
        Student s2= new Student(2,"noor");
        Student s3= new Student(3,"jake");
        Student s[]= {s1,s2,s3};

        // int array
        System.out.println("The copied int array: "+Arrays.toString(copyArray(a)));
        a[0]=10; //changing the first element
        System.out.println("The original int array with first element changed: "+Arrays.toString(a));
        //student array
        System.out.println("The copied student array: "+Arrays.toString(copyArray(s)));
       s1.setId(10); //changing the first id
        s1.setName("yasmeen"); //changing the first name
        System.out.println("The original student array with first element changed: "+Arrays.toString(s));


    }

    public static Student[] copyArray(Student a[])
    {   int size = a.length;
        Student copy[]= new Student[size];
        for (int i = 0; i <size ; i++) {
            copy[i]=a[i];
        }
        return copy;
    }

public static int[] copyArray(int a[])
{   int size = a.length;
    int copy[]= new int[size];
    for (int i = 0; i <size ; i++) {
        copy[i]=a[i];
    }
    return copy;
}

}
