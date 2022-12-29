public class Equiles {
    public static void main(String[] args) {
int a[]={1,2,3,4,5}, b[]={1,2,3,4,5},a1[]={1,2,3,4,5,5},b1[]={1,2,3,4,5,6};
        Student s1= new Student(1,"sara");
        Student s2= new Student(2,"noor");
        Student s3= new Student(3,"jake");
        Student s4= new Student(4,"lila");
        Student std1[]= {s1,s2,s3},std2[]= {s1,s2,s3},std3[]= {s1,s2,s3,s4},std4[]= {s1,s2,s3,s2};
        //comparing ints
        System.out.println("Expected result is true. \n The result is:  "+areEqual(a,b));
        System.out.println("Expected result is false. \n The result is:  "+areEqual(a1,b1));
        //comparing objects
        System.out.println("Expected result is true. \n The result is:  "+areEqual(std1,std2));
        System.out.println("Expected result is false. \n The result is:  "+areEqual(std3,std4));


    }
    public static boolean areEqual(int a[], int b[])
    {
        int size1 = a.length, size2= b.length;
        if(size1!=size2)
        return false;
        for (int i = 0; i <size1; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }

    public static boolean areEqual(Student a[], Student b[])
    {
        int size1 = a.length, size2= b.length;
        if(size1!=size2)
            return false;
        for (int i = 0; i <size1; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }

}
