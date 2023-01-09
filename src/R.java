
public class R {
    public static void main(String[] args) {
        String str = "4a1b4c  6#”";

        System.out.println(findSumNumbers(str));

    }

    public static int findSumNumbers(String str) {// This will hold the total sum
        int sum = 0;
        // This will hold the current number to be added to the sum
        int currentNumber = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) { // Check if the character is a digit and if true add it to the currentNumber
                // Try and use debugger to understand how this part works if it's confusing (it was for me)
                currentNumber = currentNumber * 10 + Character.getNumericValue(str.charAt(i));
            } else {
                // If the current character that we're iterating over is not a number, then we add the value held by the currentNumber to sum
                // and reset the currentNumber variable
                sum += currentNumber;
                currentNumber = 0;
            }
        }
        // This part is necessary because if the last character in the string is a number, it won't be added to the sum
        sum += currentNumber;

        return sum;
//    public static int findSumNumbers(String str1){
//        char[] c = str1.toCharArray();
//        int sum =0;
//        for (int i = 0; i < c.length; i++) {
//            if(Character.isDigit(c[i])) {
//                int a = Integer.parseInt(String.valueOf(c[i]));
//                sum = sum +a;
//
//            }
//        }System.out.println("Sum of digits is = " + sum);
//        return sum;
//    }
    }
}

