class Solution {
    public boolean isPalindrome(int x) {
        // Convert the integer to a string
        String numberAsString = String.valueOf(x);

        // Create an array to store the characters of the string
        char[] characters = numberAsString.toCharArray();

        // Create a second array to store the characters of the string in reverse order
        char[] reversedCharacters = new char[characters.length];
        for (int i = characters.length - 1, j = 0; i >= 0; i--, j++) {
            reversedCharacters[j] = characters[i];
        }

        // Compare the two arrays
        return Arrays.equals(characters, reversedCharacters);
    }
}