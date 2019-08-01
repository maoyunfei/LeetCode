package MedianOfTwoSortedArrays;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2019-07-29
 */
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        boolean desc1 = nums1.length > 1 && nums1[0] >= nums1[nums1.length - 1];
        boolean desc2 = nums2.length > 1 && nums2[0] >= nums2[nums2.length - 1];
        int total = nums1.length + nums2.length;

        int i = 0;
        int j = 0;
        if (desc1) {
            i = nums1.length - 1;
        }
        if (desc2) {
            j = nums2.length - 1;
        }
        int pass = 0;
        int number1 = 0;
        int number2 = 0;
        while (pass != total / 2 + 1) {
            number1 = number2;
            if (i >= 0 && i <= nums1.length - 1 && j >= 0 && j <= nums2.length - 1) {
                if (nums1[i] <= nums2[j]) {
                    number2 = nums1[i];
                    if (desc1) {
                        i--;
                    } else {
                        i++;
                    }
                } else {
                    number2 = nums2[j];
                    if (desc2) {
                        j--;
                    } else {
                        j++;
                    }
                }
            } else if (i >= 0 && i <= nums1.length - 1) {
                number2 = nums1[i];
                if (desc1) {
                    i--;
                } else {
                    i++;
                }
            } else if (j >= 0 && j <= nums2.length - 1) {
                number2 = nums2[j];
                if (desc2) {
                    j--;
                } else {
                    j++;
                }
            }
            pass++;
        }
        if (total % 2 == 1) {
            return number2;
        } else {
            return ((double) number1 + number2) / 2;
        }
    }
}
