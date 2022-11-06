public class SomeClass {
    public static boolean someMethod(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPassword(password);
            if (!password.equals(confirmPassword)) throw new WrongPasswordException("password is not confirmed");
        } catch (WrongLoginException e1) {
            System.out.println("Wrong login - " + e1.getMessage());
        }catch (WrongPasswordException e2){
            System.out.println("Wrong password - " + e2.getMessage());
        }
        return true;
    }

    static void checkLogin(String login) throws WrongLoginException {
        if (login == null) throw new WrongLoginException("login is null");
        if (login.isBlank()) throw new WrongLoginException("login is empty");
        if (login.length() > 20) throw new WrongLoginException("login too long");
        if (!login.matches("^[a-zA-Z_0-9]+$")) throw new WrongLoginException("login contains wrong symbols");
    }
    static void checkPassword (String password) throws WrongPasswordException{
        if (password == null) throw new WrongPasswordException("password is null");
        if (password.isBlank()) throw new WrongPasswordException("password is empty");
        if (password.length() > 20) throw new WrongPasswordException("password too long");
        if (!password.matches("^[a-zA-Z_0-9]+$")) throw new WrongPasswordException("password contains wrong symbols");
    }
}
