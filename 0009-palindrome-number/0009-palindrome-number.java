class Solution {
    public boolean isPalindrome(int x) {
        String intToArray = String.valueOf(x);
        char[] charArray = intToArray.toCharArray();
        char[] reverseArray = new char[charArray.length];
        
        for(int i=charArray.length-1,j=0; i >=0; i--,j++){
            reverseArray[j] = charArray[i];
        }
        
        return Arrays.equals(charArray, reverseArray);
    }
}