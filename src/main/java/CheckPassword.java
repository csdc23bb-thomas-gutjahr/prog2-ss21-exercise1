import java.util.regex.Pattern;

public class CheckPassword {


    public final Pattern textPatternLower = Pattern.compile("[a-z]");   //Lower Case Pattern
    public final Pattern textPatternUpper = Pattern.compile("[A-Z]");   //Upper Case Pattern
    public final Pattern textPatternDigit = Pattern.compile("[0-9]");   //Digit Pattern
    public final Pattern textPatternSpecial = Pattern.compile("[()#$?!%/@]");   //Special Character Pattern
    public final Pattern textPatternTwoDigitRow = Pattern.compile("(012|123|234|345|456|567|678|789)"); //Two Digits in Row Pattern
    public final Pattern textPatternThreeDigitRow = Pattern.compile("\\d(\\d)\\1{3}");  //Three of the same Digits in Row Pattern

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

    //Method to Check if there are more than two digits in a row e.x. 123
    public boolean checkTwoNumbersInRow() {

        return textPatternTwoDigitRow.matcher(this.password).find();
    }

    //Method to Check if there are more than three digits of the same in a row ex 1111
    public boolean checkThreeDigitRow() {

        return textPatternThreeDigitRow.matcher(this.password).find();
    }
}
