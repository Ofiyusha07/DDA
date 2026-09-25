The task is to find a target value in a sorted array of integers. If the target exists, the function should return its index. If it does not exist, the function should return -1.

I used binary search. I keep two boundaries: left and right. At each step, I calculate the middle index and compare the middle value with the target.

If the middle value is equal to the target, I return its index.

If the middle value is smaller than the target, I continue searching in the right half of the array.

If the middle value is greater than the target, I continue searching in the left half.

The search stops when the target is found or when there are no elements left to check.

Time Complexity: O(log n)

At every step, the search area is reduced approximately by half. Therefore, the number of iterations grows logarithmically with the size of the array.

Space Complexity: O(1)

The algorithm only uses a few variables such as left, right, and middle. It does not create another array or use additional data structures.

A simpler approach would be linear search, where every element is checked one by one. However, linear search has O(n) time complexity.

Binary search is more efficient for a sorted array because it reduces the search area by half at every step. Therefore, it achieves O(log n) time complexity.
