class Solution {
    public int calPoints(String[] operations) {
      Stack<Integer> st = new Stack();
      int sum =0;
      for(int i=0;i<operations.length;i++){
            String str =  operations[i] ;
        if(str.equals("C")){
            st.pop();
        }else if(str.equals("D")){
                st.push(2 * st.peek());
        }else if(str.equals("+")){
            int last = st.pop();
            int secondLast = st.peek();
            st.push(last);
            st.push(last + secondLast);
        }else{
          st.push(Integer.parseInt(str));
        }
      }  
      while(!st.isEmpty()){
        sum = sum + st.pop();

      }
      return sum ;
    }
}