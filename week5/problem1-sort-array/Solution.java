
class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }

        int mid = nums.length / 2;
        int[] a = new int[mid];
        int[] b = new int[nums.length - mid];

        for (int i = 0; i < mid; i++) {
            a[i] = nums[i];
        }

        for (int i = mid; i < nums.length; i++) {
            b[i - mid] = nums[i];
        }

        sortArray(a);
        sortArray(b);

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                nums[k++] = a[i++];
            } else {
                nums[k++] = b[j++];
            }
        }

        while (i < a.length) {
            nums[k++] = a[i++];
        }

        while (j < b.length) {
            nums[k++] = b[j++];
        }

        return nums;
    }
}
