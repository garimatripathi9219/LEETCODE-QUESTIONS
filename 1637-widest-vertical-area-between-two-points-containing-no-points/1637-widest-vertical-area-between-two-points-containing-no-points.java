class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
      int[] arr = new int[points.length];
      int k =0;
      for(int i=0; i<points.length;i++){
        arr[k] = points[i][0];
        k++;
      }
      Arrays.sort(arr);
      int left =0;
      int right = 1;
      int sub = 0;
      int max =0;
      while(right<arr.length){
        sub = arr[right]-arr[left];
        max = Math.max(max,sub);
        left++ ;
        right++;
      }
      return max;
        
    }
}