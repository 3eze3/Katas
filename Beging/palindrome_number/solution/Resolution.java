package Beging.palindrome_number.solution;

public class Resolution {
   public boolean isPalindrome(int x) {
      if (x < 0)
         return false;
      int originalNumber = x;
      int reverseNumber = 0;
      while (x > 0) {
         int digit = x % 10;
         reverseNumber = reverseNumber * 10 + digit;
         x /= 10;
      }
      return originalNumber == reverseNumber;
   }
}