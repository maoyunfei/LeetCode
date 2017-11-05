[Array Partition I](https://leetcode.com/problems/array-partition-i/description/)

这道题只需要先排序，再计算偶数下标0，2，4...的和。

数组排序，Java有两种方法：\
```Arrays.sort(int[] a)``` ；```IntStream.of(int[] a).sorted().toArray()``` \
默认升序排序，第一种应该会比第二种排序速度快。