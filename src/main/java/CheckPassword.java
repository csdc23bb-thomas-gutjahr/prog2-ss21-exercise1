public class CheckPassword {

    String password;

    //Constructor
    public CheckPassword(String password) {
        this.password = password;
    }

    //Getter
    public String getPassword() {
        return password;
    }

    //Setter
    public void setPassword(String password) {
        this.password = password;
    }

    //Method to Check the Lenght of the Generated Password it must be 8-25 Characters long
    public Boolean calcLenght(String password) {
        int lenght = password.length();

        if (lenght >= 8 && lenght <= 25)
            return true;
        else{
            return false;
        }
    }

    public boolean checkLowerCase() {
        return true;
    }

    public boolean checkUpperCase() {
        return true;
    }
}
