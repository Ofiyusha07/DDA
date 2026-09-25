public class FirstBadVersion {

    private static int badVersion = 4;

    public static boolean isBadVersion(int version) {
        return version >= badVersion;
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int middle = left + (right - left) / 2;

            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));

        badVersion = 1;
        System.out.println(firstBadVersion(1));
    }
}
