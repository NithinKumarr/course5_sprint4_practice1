package validator;
import java.util.*;
import java.lang.String;
public class CredentialsValidatorImpl
{

    public String validateUser(String name, String password){
        CredentialsValidator credentialsValidator =
                (userId,Password) -> {
                    if(userId.equals("admin") && Password.equals("1234"))
                        return "valid user";
                    else
                        return "invalid user";
                };
        String result = credentialsValidator.validator(name,password);
        return result;
    }
    public static void main(String[] args) {
        CredentialsValidatorImpl credentialsValidator=new CredentialsValidatorImpl();
        String result=credentialsValidator.validateUser("admin","1234");
        System.out.println(result);
    }
}