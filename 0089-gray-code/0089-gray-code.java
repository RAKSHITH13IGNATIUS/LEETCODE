import java.util.*;

public class Solution {

    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();

        int total = 1 << n; // 2^n values

        for (int i = 0; i < total; i++) {
            int gray = i ^ (i >> 1); // Gray code formula
            result.add(gray);
        }

        return result;
    }
}
