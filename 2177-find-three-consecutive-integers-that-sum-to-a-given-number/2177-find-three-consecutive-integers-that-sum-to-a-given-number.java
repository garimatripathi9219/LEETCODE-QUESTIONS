class Solution {
    public long[] sumOfThree(long num){
        long[] arr = new long[3];
      long x = num/3 ;
            if(x+ (x-1)+ (x+1) ==num ){
                    arr[0]= x-1 ;
                     arr[1]= x ;
                      arr[2]= x+1;
                       return arr;
        }
        return new long[]{} ;
    }
}