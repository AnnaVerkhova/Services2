package validServices;

import validServices.model.User;

import static validServices.UserValidetionException.MAX_AGE;
import static validServices.UserValidetionException.MIN_AGE;

public class UserValidetionService {

        public void validate (User user) {

            if (!validateMinNameLength(user.getFirstName(), 3)) {
                System.out.println(UserValidetionException.MIN_LENGHT_ERROR);

            }

            if (!validateMaxNameLength(user.getFirstName(), 15)) {
                System.out.println(UserValidetionException.MAX_LENGTH_ERROR);

            }
            if (!validateMinNameLength(user.getLastName(), 3)){
                System.out.println(UserValidetionException.MIN_LENGHT_ERROR);
            }
            if (!validateMaxNameLength(user.getLastName(), 15)){
                System.out.println(UserValidetionException.MAX_LENGTH_ERROR);
            }

            if (!validateMinAge(user.getAge())){
                System.out.println("ERROR : your age is less than"  + UserValidetionException.MIN_AGE);
            }
            if (!validateMaxAge(user.getAge())){
                System.out.println("ERROR : your age is over"  +  UserValidetionException.MAX_AGE);
            }
        }

        public static boolean validateMinAge(int age) {
            if (age > UserValidetionException.MIN_AGE) {
                return true;
            }else{
                return false;
            }
        }
        public static boolean validateMaxAge(int age ) {
            if(age < UserValidetionException.MAX_AGE){
                return true;
            }else {
                return false;
            }
        }

        public static boolean validateMaxNameLength(String name, int maxLength){
            if (name.length() < maxLength) {
                return true;
            }else {
                return false;
            }
        }

        public static boolean validateMinNameLength(String name, int minLenght) {
            if (name.length() > minLenght){
            return true;
            }else{
            return false;
            }
        }
    }
