class Solution {
    public boolean isPalindrome(int x) {
        String intToString = String.valueOf(x);
        char[] stringArray = intToString.toCharArray();
        char[] reverseArray = new char[stringArray.length];
        
        for(int i=stringArray.length-1, j=0; i >= 0; i--, j++){
            reverseArray[j] = stringArray[i];
        }
        
        return Arrays.equals(stringArray, reverseArray);
    }
}