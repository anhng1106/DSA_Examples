package Group3;

public class Palindromic_Substring {
    //Solution 1

    //"T", "O", "T", "X", "G", "H", "O", "T", "T", "O", "H", "G"
    //"A", "B", "F", "G", "H", "I", "K", "L", "M", "L", "K", "I", "H", "G", "H"
    public static int palindromicSubstring2(String[] array) {
        int maxLength = 0;
    
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= i + 1; j--) {
                if (isPalindrome(array, i, j)) {
                    int currentLength = j - i + 1;
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                    }
                }
            }
        }
        return maxLength;
    }

   
    private static boolean isPalindrome(String[] array, int left, int right) {
        while (left < right) {
            if (!array[left].equals(array[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //Solution 2

    //"T", "O", "T", "X", "G", "H", "O", "T", "T", "O", "H", "G"
    //"A", "B", "F", "G", "H", "I", "K", "L", "M", "L", "K", "I", "H", "G", "H"
    public static int palindromicSubstring(String[] array) {
        int maxLength = 0, currentLength;
        for (int i = 1; i < array.length; i++) {
            currentLength = 0;
            int left = i-1, right = i+1;
            while (left >= 0 && right < array.length && array[left].equals(array[right])) {
                currentLength +=2;
                left--; right++;
            }
            if ((currentLength + 1) > maxLength) 
                maxLength = currentLength + 1;
        }

       
        for (int i = 0; i < array.length; i++) {
            int left = i, right = i+1;
            currentLength = 0;
            while (left >= 0 && right < array.length && array[left].equals(array[right])) {
                currentLength +=2;
                left--; right++;
            }
            if (currentLength > maxLength) 
                maxLength = currentLength ;
        }
        return maxLength;
    }

    
    public static void main(String[] args) {
        String[] array = {"T", "O", "T", "X", "G", "H", "O", "T", "T", "O", "H", "G"};
        String[] array2 = {"A", "B", "F", "G", "H", "I", "K", "L", "M", "L", "K", "I", "H", "G", "H"};
        String[] array3 = {"A", "A", "B", "B", "A", "A"};

        
        System.out.println(palindromicSubstring(array));
        System.out.println(palindromicSubstring(array2));
        System.out.println(palindromicSubstring(array3));

        System.out.println();

        System.out.println(palindromicSubstring2(array));
        System.out.println(palindromicSubstring2(array2));
        System.out.println(palindromicSubstring2(array3));


    }
}
