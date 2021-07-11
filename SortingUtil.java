public class SortingUtil {
    public static void insertSortChar(char[] chars) {
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < chars.length - 1; i++) {
            // Find the minimum element in unsorted array by one iteration
            int minIndex = i;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] < chars[minIndex])
                    minIndex = j;
            }
            // Swap found minimum element with first element
            swap(chars, minIndex, i);
        }
    }
    public static void swap(char [] chars, int minIndex, int i) {
        char temp = chars[minIndex];
        chars[minIndex] = chars[i];
        chars[i] = temp;
    }
}
