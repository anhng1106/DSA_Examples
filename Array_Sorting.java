package Group3;

public class Array_Sorting {
    //Sắp xếp thứ tự tăng dần từ 2 mảng tăng dần

    //array1 = {2,5,7,9,14};
    //array2 = {3,5,7,9,14,35,78};
    //Solution 1
    public static void sort1(int[] array1, int[] array2){
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        for (int i = 0; i < array3.length - 1 ; i++) {
            for (int j = i + 1; j < array3.length; j++) {
                if(array3[i] > array3[j]){
                    int temp = array3[i];
                    array3[i] = array3[j];
                    array3[j] = temp;
                }
            }
        }
        for (int i : array3) {
            System.out.print(i + " ");
        }
        
    }

    //array1 = {2,5,7,9,14};
            //  i
    //array2 = {3,5,7,9,14,35,78};
            //  j
    //Solution 2
    public static void sort2(int[] array1,  int[] array2){
        int i = 0, j = 0;
        while (i < array1.length && j < array2.length) {
            if(array1[i] <= array2[j]){
                System.out.print(array1[i] + " "); i++;
            }else{
                System.out.print(array2[j] + " "); j++;
            }
        }
        while (i < array1.length) {
            System.out.print(array1[i] + " "); i++;
        }
        while (j < array2.length) {
            System.out.print(array2[j] + " "); j++;
        }
    }
    public static void main(String[] args) {
        int[] array1 = {2,5,7,9,14};
        int[] array2 = {3,5,7,9,14,35,78};

        
        sort1(array1, array2);
        System.out.println();
        sort2(array1, array2);

    }
}
