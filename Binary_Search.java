package Group3;

public class Binary_Search {
    public static int search(int [] array, int l, int r, int target){
        int mid = (l + r) / 2;
        if(array[mid] == target)
            return mid;

        if(array[mid] < target)
            return search(array, mid + 1, r,target);
        return search(array, l, mid-1,target);
    }

    public static int search1(int[] array, int l, int r, int target){
        while (l <= r) {
           int mid = (l + r) / 2;
            if(array[mid] == target)
                return mid;
            if(array[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
       
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        int left = 0; int right = array.length-1;
       
        int index = search1(array, left, right, 4);

        System.out.println(index);
    }
}
