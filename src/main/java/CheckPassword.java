import java.util.regex.Pattern;

public class CheckPassword {


    public final Pattern textPatternLower = Pattern.compile("[a-z]");
    public final Pattern textPatternUpper = Pattern.compile("[A-Z]");
    public final Pattern textPatternDigit = Pattern.compile("[0-9]");
    public final Pattern textPatternSpecial = Pattern.compile("[()#$?!%/@]");

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
    public boolean calcLenght() {
        int lenght = this.password.length();

        if (lenght >= 8 && lenght <= 25)
            return true;
        else{
            return false;
        }
    }

    //Method to Check if one Lower Case is in
    public boolean checkLowerCase() {

        return textPatternLower.matcher(this.password).find();
    }

    //Method to Check if one Upper Case is in
    public boolean checkUpperCase() {

        return textPatternUpper.matcher(this.password).find();

    }

    //Method to Check if one Digit is in
    public boolean checkDigit() {

        return textPatternDigit.matcher(this.password).find();

    }

    //Method to Check if one Special is in
    public boolean checkSpecial() {

        return textPatternSpecial.matcher(this.password).find();
    }
}
