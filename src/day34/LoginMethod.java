package day34;

public class LoginMethod {

    public static void loginFunc (String username, String password){
        if(username.equals("user") && password.equals("abc123")){
            System.out.println("Login successful");
        }else if(!username.equals("user")){
            System.out.println("Login failed, wrong user name!");
        }else if(!password.equals("abc123")){
            System.out.println("login failed, wrong password");
        }

    }

    public static void main(String[] args) {
        loginFunc("user","abc123");
        loginFunc("dimka", "abc123");

        System.out.println(loginActivity("user", "abc123"));


        System.out.println(loginActivity("user123","dadadad"));


        if(loginActivity("user", "abc123")){
            System.out.println("Add java book to cart");
            System.out.println("pay for java book");
            System.out.println("view cart");
        }else {
            System.out.println("No shopping unless you sign in");
        }
    }

    public static boolean loginActivity (String userName,String password){
        if(userName.equals("user") && password.equals("abc123")){
            return true;
        }
        return false;
    }
}
