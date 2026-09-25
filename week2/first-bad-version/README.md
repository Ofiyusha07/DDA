
The task is to find the first bad version among versions from 1 to n. Once a version is bad, all versions after it are also bad.

I used binary search to find the first bad version.

I keep two boundaries: `left` and `right`. At each step, I check the middle version using `isBadVersion()`.

If the middle version is bad, it can be the first bad version, so I move the `right` boundary to `middle`.

If the middle version is good, the first bad version must be after it, so I move `left` to `middle + 1`.

When `left` and `right` become equal, that position is the first bad version.

Time Complexity: O(log n)

At each step, the search range is reduced approximately by half. Therefore, the number of calls to `isBadVersion()` grows logarithmically with n.

Space Complexity: O(1)

The algorithm only uses `left`, `right`, and `middle`. No additional data structures are required.

A simple approach would be to check every version starting from version 1. This could require O(n) calls to `isBadVersion()` in the worst case.

Binary search improves this to O(log n) calls because it eliminates approximately half of the possible versions after each check.

This is especially useful because the problem asks to minimize the number of API calls.
