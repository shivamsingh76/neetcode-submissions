class Solution {
    public boolean isPalindrome(String s) {
        String string = s.toLowerCase();
        List<Character> str = new ArrayList<>();

        for (char ch: string.toCharArray())
            if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z')) 
                str.add(ch);

        int n = str.size();
        for (int i=0 ; i < n/2; i++ ) {
            if (str.get(i) != str.get(n-1-i))
                return false;
        }

        return true;
        
    }
}
