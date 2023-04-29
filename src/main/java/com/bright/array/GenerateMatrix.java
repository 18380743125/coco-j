package com.bright.array;

public class GenerateMatrix {
    public static Integer[][] generate(int n) {
        Integer[][] result = new Integer[n][n];
        int loop = 0;
        int x = 0, y = 0;
        int count = 1;
        while (loop < n / 2) {
            // 上行
            while (y < n - loop - 1) {
                result[x][y++] = count++;
            }
            // 右列
            while (x < n - loop - 1) {
                result[x++][y] = count++;
            }
            // 下行
            while (y > loop) {
                result[x][y--] = count++;
            }
            // 左列
            while (x > loop) {
                result[x--][y] = count++;
            }
            loop++;
            x = loop;
            y = loop;
        }
        if(n % 2 == 1) {
            while(y < n - loop) result[x][y++] = count++;
        }
        return result;
    }
}
