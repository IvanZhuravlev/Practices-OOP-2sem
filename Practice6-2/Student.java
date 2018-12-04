public class Student {
    public static int id;
    public Student()
    {
        id = 0;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public String toString()
    {
       return "Студент " + id ;
    }
}
