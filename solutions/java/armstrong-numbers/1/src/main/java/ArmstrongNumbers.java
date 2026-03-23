import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        List<Integer> digits = new ArrayList<>();
        int originalNumber = numberToCheck;
        if (numberToCheck == 0) {
            digits.add(0);
        }

        while (numberToCheck > 0) {
            digits.add(numberToCheck % 10);
            numberToCheck /= 10;

        }
        Collections.reverse(digits);

        int total = 0;
        for (int i = 0; i < digits.size(); i++) {
            total += Math.pow(digits.get(i), digits.size());
        }
        return total == originalNumber;
    }

}
