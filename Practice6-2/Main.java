import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Student[] students = new Student[25];
        Random random = new Random(150);
        for (int i = 0; i < students.length ; i++)
        {
            students[i].setId(random.nextInt());
            QuickSort.array[i] = students[i].getId();
        }
        QuickSort.doSort(0, QuickSort.Array_Length -1);
        show(students);
    }
    public static void show(Student[] students)
    {
        for (int i = 0; i < students.length ; i++)
        {
           System.out.println(students[i].toString());
        }
    }
}
