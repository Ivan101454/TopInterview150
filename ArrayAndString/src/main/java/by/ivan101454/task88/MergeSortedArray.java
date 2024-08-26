package by.ivan101454.task88;

public class MergeSortedArray {
    private static int[] result;
    public static void main(String[] args) {

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int length = m + n;
        int[] temp = new int[length];
        int selector = 0;
        if (n == 0) {
            selector = 1;
        } else if (m == 0) {
            selector = 2;
        }
        switch (selector) {
            case 1:
                temp = nums1;
                break;
            case 2:
                temp = nums2;
                break;
            case 0:
                while (length-- > 0) {
                    if((nums1[i] > nums2[j] && n > 0) || m == 0) {
                        temp[k++] = nums2[j++];
                        n--;
                    } else if ((nums1[i] <= nums2[j] && m > 0) || n == 0) {
                        temp[k++] = nums1[i++];
                        m--;
                    }
                }
                break;
        }
        nums1 = temp;
        result = nums1;
    }

    public static int[] getResult() {
        return result;
    }
}
