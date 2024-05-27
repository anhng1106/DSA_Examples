package Group3;

public class Three_Largest_Consecutive_Elements {
    //Dãy 3 phần tử con liên tiếp lớn nhất trong mảng

    //int[] array = {1, 3, 4, 4, 8, 1, 3, 3, 9, 4};
    //Solution 1
    public static void Solution1(int[] array){
        int max = 0;
        int temp = 0;
        for (int i = 0; i < array.length -2; i++) {
            for (int j = i; j < i + 3; j++) {
                temp += array[j];
            }
            if (temp >= max) {
                max = temp;
            }
            temp = 0;
        }
        System.out.println(max);
    }
    ////int[] array = {1, 3, 4, 4, 8, 1, 3, 3, 9, 4};
    //Solution 2
    public static void Solution2(int[] array){
        int max = 0;
        int temp = 0;
        int index = 0;
        for (int i = 0; i < 3; i++) {
            temp += array[i];
        }
        max = temp;
        for (int i = 1; i < array.length - 2; i++) {
            temp = temp - array[index] + array[i + 3 -1];
            if (temp > max) {
                max = temp;
            }
            index = i;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 4, 8, 1, 3, 3, 9, 4};

        Solution1(array);
        Solution2(array);
    }
}
