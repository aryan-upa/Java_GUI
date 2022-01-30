package Practice.Proj2;

import java.lang.Math;
import java.util.Random;

public class C2Math {

    public static boolean isPrime (int num) throws ArithmeticException {
        if(num < 0) {
            throw new ArithmeticException("Negative Number!");
        }
        if(num == 0 || num == 1) {
            return false;
        }
        else {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0)
                    return false;
            }
            return true;
        }
    }

    public static boolean isArmstrong (int num) {
        String str = String.valueOf(num);
        int pos = 0;
        int temp = 0;
        while(pos!= str.length()) {
            temp += Math.pow(Integer.parseInt(String.valueOf(str.charAt(pos))) , str.length());
            pos++;
        }
        return temp == num;
    }

    public static int fact (int term) throws ArithmeticException {
        if(term < 0) {
            throw new ArithmeticException("Negative Number can not be factored.");
        }
        if(term == 1 || term == 0)
            return 1;
        return term * fact(term - 1);
    }

    public static int random() {
        Random num = new Random();
        return num.nextInt(1000);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static float div(int x, int y) {
        return (float) x / y;
    }

}