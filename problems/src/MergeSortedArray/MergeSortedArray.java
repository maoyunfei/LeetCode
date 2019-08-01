package MergeSortedArray;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < m; j++) {
                if (nums2[i] < nums1[j]) {
                    for (int k = nums1.length - 2; k >= j; k--) {
                        nums1[k + 1] = nums1[k];
                    }
                    nums1[j] = nums2[i];
                    m++;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                nums1[m] = nums2[i];
                m++;
            }
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
        while (i < m) {
            result[k++] = nums1[i++];
        }
        while (j < n) {
            result[k++] = nums2[j++];
        }
        for (int x = 0; x < m + n; x++) {
            nums1[x] = result[x];
        }
    }
}
