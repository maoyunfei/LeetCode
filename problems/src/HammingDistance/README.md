[Hamming Distance](https://leetcode.com/problems/hamming-distance/description/)

这道题其实是要计算两个数“异或”运算之后，结果的二进制表示中有多少个‘1’。

我的方法是将"异或"后的结果转换成二进制字符数组，再计算其中有多少个‘1’。

在eetcode上别人的解决方案中，计算‘1’的个数可以用【移位运算与‘1’来计算】，如下：
```
public int hammingDistance(int x, int y) {
    int xor = x ^ y, count = 0;
    for (int i=0;i<32;i++) count += (xor >> i) & 1;
    return count;
}
```


另外Java还有个功能函数```Integer.bitCount(int i)``` 来计算‘i’中含有多少个‘1’。