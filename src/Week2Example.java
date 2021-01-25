/*
 * @param args the command line arguments
 */
public class Week2Example
{
    public static void main (String [] args)
    {
        //array store 5 students details
        Student[] list = new Student[5]; //array of object declaration
        Student s1 = new Student();
        s1.setName("John");
        s1.setAge(21);
        list[0] = s1; //saved the object in an array
        System.out.println(s1); //prints the object address
        System.out.println("Name: " + s1.getName() + "\nAge: " + s1.getAge());
        System.out.println("Jimpy is HEREEE");
    }
}
