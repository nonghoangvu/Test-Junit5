package com.vunh.Service;

public class MathUtils {
    int[] array;

    public MathUtils(int[] array) {
        this.array = array;
    }

    public int hieu() {
        if (this.array.length == 0) {
            return 0;
        }
        int result = this.array[0];
        for (int i = 1; i < this.array.length; i++) {
            result = result - this.array[i];
        }
        return result;
    }

}
