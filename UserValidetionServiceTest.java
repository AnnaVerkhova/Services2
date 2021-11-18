package validServices;

import validServices.model.User;

public class UserValidetionServiceTest {
    public static void firstNameMinLengthRuleFailTest() {
        String invalidUserName = "li "; //PASSED. FAIL. Validation feature - min length for name correctly.
        UserValidetionService service = new UserValidetionService();
        boolean expectedResult = false;
        boolean actualResult = UserValidetionService.validateMinNameLength(invalidUserName, 3);

        if (expectedResult == actualResult) {
            System.out.println("PASSED. FAIL. Validation feature - min length for name correctly.");
        } else {
            System.out.println("FAILED. FAIL. Validation feature - min length for name correctly.");
        }
    }

    public static void firstNameMinLengthRuleSuccessTest() {
        String validUserName = "Anna"; //PASSED. SUCCESS. Validation feature - min length for name correctly.
        UserValidetionService service = new UserValidetionService();
        boolean expectedResult = true;
        boolean actualResult = UserValidetionService.validateMinNameLength(validUserName, 3);

        if (expectedResult == actualResult) {
            System.out.println("PASSED. SUCCESS. Validation feature - min length for name correctly.");
        } else {
            System.out.println("FAILED. SUCCESS. Validation feature - min length for name correctly.");
        }
    }

    public static void firstNameMaxLengthRuleSuccessTest() {
        String validUserName = "Alina"; //PASSED. SUCCESS. Validation feature - max length for name correctly.
        UserValidetionService service = new UserValidetionService();
        boolean expectedResult = true;
        boolean actualResult = UserValidetionService.validateMaxNameLength(validUserName, 15);

        if (expectedResult == actualResult) {
            System.out.println("PASSED. SUCCESS. Validation feature - max length for name correctly.");
        } else {
            System.out.println("FAILED. SUCCESS. Validation feature - max length for name correctly.");
        }
    }

    public static void firstNameMaxLengthRuleFailTest() {
        String invalidUserName = "Aaaaaaaaaaaaaaan"; // PASSED. FAIL. Validation feature - max length for name correctly.
        UserValidetionService service = new UserValidetionService();
        boolean expectedResult = false;
        boolean actualResult = UserValidetionService.validateMaxNameLength(invalidUserName, 15);

        if (expectedResult == actualResult) {
            System.out.println("PASSED. FAIL. Validation feature - max length for name correctly.");
        } else {
            System.out.println("FAILED. FAIL. Validation feature - max length for name correctly.");
        }
    }

    public static void lastNameMinLengthRuleFailTest() {
        String invalidUserName = "Br "; //PASSED. FAIL. Validation feature - min length for name correctly.
        UserValidetionService service = new UserValidetionService();
        boolean expectedResult = false;
        boolean actualResult = UserValidetionService.validateMinNameLength(invalidUserName, 3);

        if (expectedResult == actualResult) {
            System.out.println("PASSED. FAIL. Validation feature - min length for lastname correctly.");
        } else {
            System.out.println("FAILED. FAIL. Validation feature - min length for lastname correctly.");
        }
    }

    public static void lastNameMinLengthRuleSuccessTest() {
        String validUserName = "petrov"; //PASSED. SUCCESS. Validation feature - min length for lastname correctly.
        UserValidetionService service = new UserValidetionService();
        boolean expectedResult = true;
        boolean actualResult = UserValidetionService.validateMinNameLength(validUserName, 3);

        if (expectedResult == actualResult) {
            System.out.println("PASSED. SUCCESS. Validation feature - min length for lastname correctly.");
        } else {
            System.out.println("FAILED. SUCCESS. Validation feature - min length for lastname correctly.");
        }
    }

    public static void lastNameMaxLengthRuleSuccessTest() {
        String validUserName = "smirnov"; //PASSED. SUCCESS. Validation feature - max length for lastname correctly.
        UserValidetionService service = new UserValidetionService();
        boolean expectedResult = true;
        boolean actualResult = UserValidetionService.validateMaxNameLength(validUserName, 15);

        if (expectedResult == actualResult) {
            System.out.println("PASSED. SUCCESS. Validation feature - max length for lastname correctly.");
        } else {
            System.out.println("FAILED. SUCCESS. Validation feature - max length for lastname correctly.");
        }
    }

    public static void lastNameMaxLengthRuleFailTest() {
        String invalidUserName = "rojdesstvennskiy"; //PASSED. FAIL. Validation feature - max length for lastname correctly.
        UserValidetionService service = new UserValidetionService();
        boolean expectedResult = false;
        boolean actualResult = UserValidetionService.validateMaxNameLength(invalidUserName, 15);

        if (expectedResult == actualResult) {
            System.out.println("PASSED. FAIL. Validation feature - max length for lastname correctly.");
        } else {
            System.out.println("FAILED. FAIL. Validation feature - max length for lastname correctly.");
        }
    }

    public static void ageMinResultSuccessTest() {
        int validatAge = 20; //PASSED. SUCCESS. Validation feature - min age correctly.
        UserValidetionService service = new UserValidetionService();
        boolean expectedResult = true;
        boolean actualResult = UserValidetionService.validateMinAge(validatAge);

        if (expectedResult == actualResult) {
            System.out.println("PASSED. SUCCESS. Validation feature - min age correctly.");
        } else {
            System.out.println("FAILED. SUCCESS. Validation feature - min age correctly.");
        }
    }

    public static void ageMaxResultFailTest() {
        int invalidatAge = 123; //PASSED. FAIL. Validation feature - max age correctly.
        UserValidetionService service = new UserValidetionService();
        boolean expectedResult = false;
        boolean actualResult = UserValidetionService.validateMaxAge(invalidatAge);

        if (expectedResult == actualResult) {
            System.out.println("PASSED. FAIL. Validation feature - max age correctly.");
        } else {
            System.out.println("FAILED. FAIL. Validation feature - max age correctly.");
        }
    }
}








