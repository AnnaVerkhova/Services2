package validServices;

import validServices.model.User;


public class UserValidetionDemo {

    public static void main (String [] args){

        UserValidetionService service = new UserValidetionService();

        User annaUser = new User ("anna","verkhova",29 ); //empty field.
        service.validate(annaUser);

        User liUser = new User("li","Brus", 123);//ERROR : name length is less 3 letters.
                                                                      // ERROR : your age is over120
        service.validate(liUser);
    }
}
