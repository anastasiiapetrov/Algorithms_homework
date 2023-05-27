public class Homework_4 {
    public static int sortedArrays(int arr1[], int arr2[], int m, int n, int k)
    {
        int[] sortedA = new int[m + n];
        int i = 0, b = 0, c = 0;
        while (i < m && b < n)
        {
            if (arr1[i] < arr2[b])
                sortedA[c++] = arr1[i++];
            else
                sortedA[c++] = arr2[b++];
        }
        while (i < m)
            sortedA[c++] = arr1[i++];
        while (b < n)
            sortedA[c++] = arr2[b++];
        return sortedA[k - 1];
    }

    public static void main (String[] args)
    {
        int arr1[] = {100, 112, 256, 349, 770};
        int arr2[] = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        System.out.print(sortedArrays(arr1, arr2, 5, 7, k));
    }
}
