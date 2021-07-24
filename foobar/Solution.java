public class Solution {
    public static int[] solution(int [] l, int t) {
        int []ans = new int[2];
        int cur_sum = l[0], start = 0, i;
        int n = l.length;
        for(i = 1; i <= n; i++) {
            while(cur_sum > t && start < i - 1) {
                cur_sum = cur_sum - l[start];
                start++;
            }
            if(cur_sum == t) {
                ans[0] = start;
                ans[1] = i - 1;
                return ans; 
            }

            if(i < n) {
                cur_sum += l[i];
            }
        }
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }
    public static void main(String []args) { 
        int arr[] = {1, 2, 3, 4};
        int []ans = solution(arr, 15);
        System.out.println(ans[0] + " "+ ans[1]);
    }
}