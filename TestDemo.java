package validServices;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println("TEST REPORT: ");
        UserValidetionServiceTest.firstNameMinLengthRuleFailTest ();
        UserValidetionServiceTest.firstNameMinLengthRuleSuccessTest();
        UserValidetionServiceTest.firstNameMaxLengthRuleSuccessTest();
        UserValidetionServiceTest.firstNameMaxLengthRuleFailTest();
        System.out.println();
        UserValidetionServiceTest.lastNameMinLengthRuleFailTest();
        UserValidetionServiceTest.lastNameMinLengthRuleSuccessTest();
        UserValidetionServiceTest.lastNameMaxLengthRuleSuccessTest();
        UserValidetionServiceTest.lastNameMaxLengthRuleFailTest();
        System.out.println();
        UserValidetionServiceTest.ageMinResultSuccessTest();
        UserValidetionServiceTest.ageMaxResultFailTest();



    }
}
