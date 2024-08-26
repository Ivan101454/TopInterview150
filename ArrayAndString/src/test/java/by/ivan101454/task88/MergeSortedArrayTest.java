package by.ivan101454.task88;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MergeSortedArrayTest {

    @Test
    void isMergeByTerms() {
        int m = 0;
        int n = 1;
//        int m = 1;
//        int n = 3;

//        int[] nums1 = new int[] {1,2,3,0,0,0};
//        int[] nums2 = new int[] {2,5,6};
//        int[] output = new int[] {1,2,2,3,5,6};
        int[] nums1 = new int[0];
        int[] nums2 = new int[] {1};
        int[] output = new int[] {1};

        MergeSortedArray.merge(nums1, m, nums2, n);
        int[] result = MergeSortedArray.getResult();

        assertThat(result).containsExactly(output);
    }
}