 import java.util.*;
import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        String s = "";

        for(int i = 0; i < num.length; i++){
            s = s + num[i];
        }

        BigInteger number = new BigInteger(s);

        number = number.add(BigInteger.valueOf(k));

        s = number.toString();

        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            list.add(arr[i] - '0');
        }

        return list;
    }
}

