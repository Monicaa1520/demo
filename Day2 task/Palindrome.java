package day2;

public class Palindrome {
	public static void main(String[] args) {
        String str = "mom";
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("Not Palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome");
    }
}


