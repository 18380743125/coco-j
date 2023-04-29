package com.bright.utils;

import java.util.Arrays;

public class ArrayUtil<T> {
    public void print(T[] arr, int i, int j) {
        System.out.println("======================");
        while (i < j) {
            System.out.print(arr[i++] + " ");
        }
        System.out.println("\n======================");
    }

    // 遍历二维数组
    public void print(T[][] arr, int i, int j) {
        System.out.println("======================");
        while (i < j) {
            System.out.print(Arrays.toString(arr[i++]) + " ");
            System.out.println();
        }
        System.out.println("======================");
    }

    public void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
