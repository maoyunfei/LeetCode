package CanPlaceFlowers;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = {0, 0, 1, 0, 1};
        System.out.println(canPlaceFlowers(flowerbed, 1));
        System.out.println(canPlaceFlowers(flowerbed, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int flowers = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i - 1 < 0 || flowerbed[i - 1] == 0) && (i + 1 > flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                flowers++;
                if (flowers >= n) {
                    return true;
                }
            }
        }
        return false;
    }
}
