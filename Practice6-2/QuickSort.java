public class QuickSort {
    public static int Array_Length = 25;
    public static int array[] = new int [Array_Length];
    public static void quicksort(Student[] students)
    {
        int startindex = 0;
        int endIndex = students.length - 1;
        doSort(startindex, endIndex);
    }
    public static void doSort(int start, int end)
    {
        if(start >= end)
        {
            return;
        }
        int i = start, j = end;
        int cur = i-(i-j)/2;
        while (i<j) {
            while (i < cur && (array[i] <= array[cur]))
                i++;
            }
            while (j > cur && (array[cur] <= array[j]))
                j--;

        if(i < j)
        {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            if(i == cur)
            {
                cur = j;
            }
            else if (j == cur)
                cur = i;
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }
    public static void show(int [] array)
    {
        for (int i = 0; i < array.length ; i++)
        {
            System.out.println(array[i]);
        }
    }
}
