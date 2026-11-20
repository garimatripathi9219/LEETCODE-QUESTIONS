class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> res = new ArrayList<>();
        int i = 0;

        while(i<s1.length()){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            }else{
                int start = i;

                while(i<s1.length() && s1.charAt(i) != s2.charAt(i)){
                    i++;
                }

                res.add(Arrays.asList(
                    s1.substring(start, i),
                    s2.substring(start, i)
                ));
            }
        }
        return res;
    }
}