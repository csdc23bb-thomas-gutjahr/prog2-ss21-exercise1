import java.util.regex.Pattern;

public class CheckPassword {


    public final Pattern textPatternLower = Pattern.compile("(?=.[a-z])");
    public final Pattern textPatternUpper = Pattern.compile("(?=.[A-Z])");

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
    public Boolean calcLenght() {
        int lenght = this.password.length();

        if (lenght >= 8 && lenght <= 25)
            return true;
        else{
            return false;
        }
    }

    public Boolean checkLowerCase() {

        return textPatternLower.matcher(this.password).matches();
    }

    public boolean checkUpperCase() {

        return textPatternUpper.matcher(this.password).matches();

    }
}
