import java.util.regex.Pattern;

public class CheckPassword {


    public final Pattern textPatternLower = Pattern.compile("[a-z]");
    public final Pattern textPatternUpper = Pattern.compile("[A-Z]");
    public final Pattern textPatternDigit = Pattern.compile("[0-9]");
    public final Pattern textPatternSpecial = Pattern.compile("[()#$?!%/@]");
    public final Pattern textPatternTwoDigitRow = Pattern.compile("(012|123|234|345|456|567|678|789)");
    public final Pattern textPatternThreeDigitRow = Pattern.compile("\\d(\\d)\\1{3}");

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


    public boolean checkTwoNumbersInRow() {

        return textPatternTwoDigitRow.matcher(this.password).find();
    }

    public boolean checkThreeDigitRow() {

        return textPatternThreeDigitRow.matcher(this.password).find();
    }
}
