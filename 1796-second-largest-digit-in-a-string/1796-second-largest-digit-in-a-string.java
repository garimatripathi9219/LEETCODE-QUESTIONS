class Solution {
    public int secondHighest(String s) {
        String str = new String();
       for(int i=0; i<s.length();i++){
        if(s.charAt(i)>='0' && s.charAt(i)<='9'){
            str = str + s.charAt(i);
        }
       } 
     if(str.length()==0){
        return -1 ;
     }
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int largest = arr[arr.length-1] ;
        int secondLargest = -1 ;
        for(int i=arr.length-2; i>=0;i--){
            if(arr[i] != largest){
                secondLargest = arr[i];
                 return secondLargest -'0' ;
            }
        }
        return -1;
     
    }
}