package uk.co.argos.interview.service;

public class CardNumberValidationService {

    /**
     * 1. From the last digit moving backwards, double every second digit
     * 2. If the doubled number is greater than 9, add it's two digits together
     * 3. Sum all card digits together
     * 4. If the total ends in zero, then the number is a valid credit card
     */
    public boolean isValid(String cardNumber) {
        return false;
    }

}
