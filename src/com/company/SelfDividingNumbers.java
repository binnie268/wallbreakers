package com.company;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfDividingNumbers {

    public static void main(String[] args) {
        selfDividingNumbers(1,22);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> arrayList = new ArrayList<>();
        boolean isSelfDividing = true;
        for(int i = left; i <= right; i++) {

            String numberList = Integer.valueOf(i).toString();
            String[] stringArray = numberList.split("\\B");
            int IntegreArray[] = new int[stringArray.length];

            for(int k = 0; k < stringArray.length; k++) {
                IntegreArray[k] = Integer.parseInt(stringArray[k]);
            }
            for(int j = 0; j < IntegreArray.length; j++) {
                System.out.print(IntegreArray[j]);
                if (IntegreArray[j] == 0 || i % IntegreArray[j] != 0) {
                    isSelfDividing = false;
                    break;
                }
            }

            if(isSelfDividing) {
                arrayList.add(i);
            }

            isSelfDividing = true;

        }

        return arrayList;

    }

    //better solution

    public List<Integer> selfDividingNumbers2(int left, int right) {
        List<Integer> ans = new ArrayList();
        for (int n = left; n <= right; ++n) {
            if (selfDividing(n)) ans.add(n);
        }
        return ans;
    }
    public boolean selfDividing(int n) {
        for (char c: String.valueOf(n).toCharArray()) {
            if (c == '0' || (n % (c - '0') > 0))
                return false;
        }
        return true;
    }

}
