class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
     //   int count =0;
     int floors =0;
       int floors2 =0;
       int floors3 =0;
     int max =0;
        Arrays.sort(special);
  //    for(int i=bottom; i<top; i++){
            floors = special[0]-bottom ;
            max = Math.max(max,floors);
           floors2 = top - special[special.length-1] ;
            max = Math.max(max,floors2);

         for(int j=0; j<special.length-1; j++){
           floors3= special[j+1]-special[j]-1 ;
             max = Math.max(max,floors3);
         }
   //   } 
      return max ;
    }
}