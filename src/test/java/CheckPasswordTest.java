import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CheckPasswordTest {

    //Initial jUnit
    @BeforeAll
    static void init (){}

    @BeforeEach
    void setUp (){}

    CheckPassword testPassword;

    @DisplayName("Testing Password Lenght")
    @Test

    public void testLengthPassword(){
        testPassword = new CheckPassword("HaseBlind");
        Boolean actual = testPassword.calcLenght();
        Boolean expected = true;
        assertEquals(actual,expected);

    }

    @DisplayName("Testing Password to Short")
    @Test

    public void testToShortPassword(){
        testPassword = new CheckPassword("Hase");
        assertFalse(testPassword.calcLenght());

    }

    @DisplayName("Testing Password to Long")
    @Test

    public void testToLongPassword(){
        testPassword = new CheckPassword("HaseBlindAmSeeMitStockInDerHandOhneAugenschmausFliegtaufFlieger");
        assertFalse(testPassword.calcLenght());

    }

    @DisplayName("Testing Password have Lower Character")
    @Test

    public void testLowerCharacter() {
        testPassword = new CheckPassword("haseblind");
        assertTrue(testPassword.checkLowerCase());

    }

    @DisplayName("Testing Password have Upper Character")
    @Test

    public void testUpperCharacter(){
        testPassword = new CheckPassword("HASEBLIND");
        assertTrue(testPassword.checkUpperCase());

    }

    @DisplayName("Testing Password have Upper and Lower Character")
    @Test

    public void testCaseSensitiveCharacter(){
        testPassword = new CheckPassword("Haseblind");
        assertTrue(testPassword.checkUpperCase() && testPassword.checkUpperCase());

    }

    @DisplayName("Testing Password have at least one Digit")
    @Test

    public void testDigitYes(){
        testPassword = new CheckPassword("0123456789");
        assertTrue(testPassword.checkDigit());

    }

    @DisplayName("Testing Password have no Digit")
    @Test

    public void testDigitNo(){
        testPassword = new CheckPassword("haseblind");
        assertFalse(testPassword.checkDigit());

    }

    @DisplayName("Testing Password have at least one Special Character")
    @Test

    public void testSpecial(){
        testPassword = new CheckPassword("haseblind()#$?!%/@");
        assertTrue(testPassword.checkSpecial());

    }

    @DisplayName("Testing Password have at no Special Character")
    @Test

    public void testSpecialNo(){
        testPassword = new CheckPassword("haseblind");
        assertFalse(testPassword.checkSpecial());

    }

    @DisplayName("Testing Password have wrong Special Character €")
    @Test

    public void testSpecialEuro(){
        testPassword = new CheckPassword("€");
        assertFalse(testPassword.checkSpecial());

    }

    @DisplayName("Testing Password have wrong Special Character +")
    @Test

    public void testSpecialPlus(){
        testPassword = new CheckPassword("+");
        assertFalse(testPassword.checkSpecial());

    }

    @DisplayName("Testing Password have wrong Special Character -")
    @Test

    public void testSpecialMinus(){
        testPassword = new CheckPassword("-");
        assertFalse(testPassword.checkSpecial());

    }

    @DisplayName("Testing Password have wrong Special Character ,")
    @Test

    public void testSpecialComma(){
        testPassword = new CheckPassword(",");
        assertFalse(testPassword.checkSpecial());

    }

    @DisplayName("Testing Password have wrong Special Character ;")
    @Test

    public void testSpecialSemiColon(){
        testPassword = new CheckPassword(";");
        assertFalse(testPassword.checkSpecial());

    }

    @DisplayName("Testing Password have wrong Special Character '")
    @Test

    public void testSpecialApostroph(){
        testPassword = new CheckPassword(";");
        assertFalse(testPassword.checkSpecial());

    }

    @DisplayName("Testing Password have wrong Special Character \\")
    @Test

    public void testSpecialBackSlash(){
        testPassword = new CheckPassword("\\");
        assertFalse(testPassword.checkSpecial());

    }

    @DisplayName("Testing Password have wrong Special Character _")
    @Test

    public void testSpecialUnderScore(){
        testPassword = new CheckPassword("_");
        assertFalse(testPassword.checkSpecial());

    }

    @DisplayName("Testing Password have wrong Special Character >")
    @Test

    public void testSpecialGreater(){
        testPassword = new CheckPassword(">");
        assertFalse(testPassword.checkSpecial());

    }

    @DisplayName("Testing Password have wrong Special Character <")
    @Test

    public void testSpecialLower(){
        testPassword = new CheckPassword("<");
        assertFalse(testPassword.checkSpecial());

    }

    @DisplayName("Testing Password have wrong Special Character |")
    @Test

    public void testSpecialPipe(){
        testPassword = new CheckPassword("|");
        assertFalse(testPassword.checkSpecial());

    }

    @DisplayName("Testing Password have wrong Special Character =")
    @Test

    public void testSpecialEuqal(){
        testPassword = new CheckPassword("=");
        assertFalse(testPassword.checkSpecial());

    }




}