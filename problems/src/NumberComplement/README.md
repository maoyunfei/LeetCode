[Number Complement](https://leetcode.com/problems/number-complement/description/)

这道题是，一个数的二进制表示，求它每一位反转后的值，即取反。


我们知道一个数和它取反后的数之和为2^n-1,所以其要求的值就是2^n-1-num，这里的n为num的bit位数。


但是注意由于2^32已经超过int整型的表示范围，所以需要强转成long类型才能完整接收。