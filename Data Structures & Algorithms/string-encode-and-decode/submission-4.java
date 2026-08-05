class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for (String str: strs) {
            StringBuilder temp = new StringBuilder("#");
            temp.append(str.length());
            temp.append("%");

            encodedString.append(temp);
            encodedString.append(str);
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {

        List<String> decodedStrings = new ArrayList<>();

        int i, j, k;

        for (i=0 ; i < str.length(); ) {
            // detemining the string for length of individual strings (extracting number)
            k= i+1;
            
            while (str.charAt(k) != '%') {
                k++;
            }

            j = Integer.parseInt(str.substring(i+1, k));

            String temp = str.substring(k+1, k + j + 1);
            decodedStrings.add(temp);

            i = k+j+1;

        }

        // while (i < str.length()) {
            
        //     j = str.charAt(1+i) - '0';

        //     String temp = str.substring(i+2, i + j + 2);
        //     decodedStrings.add(temp);

        //     i = i+j+2;

        // }

        return decodedStrings;
    }
}
