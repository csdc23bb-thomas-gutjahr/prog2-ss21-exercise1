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
        testPassword = new CheckPassword("HaseBlind"); //Define Password
        Boolean actual = testPassword.calcLenght();
        Boolean expected = true;
        assertEquals(actual,expected);

    }

    @DisplayName("Testing Password to Short")
    @Test

    public void testToShortPassword(){
        testPassword = new CheckPassword("Hase"); //Define Password
        assertFalse(testPassword.calcLenght());

    }

    @DisplayName("Testing Password to Long")
    @Test

    public void testToLongPassword(){
        testPassword = new CheckPassword("HaseBlindAmSeeMitStockInDerHandOhneAugenschmausFliegtaufFlieger"); //Define Password
        assertFalse(testPassword.calcLenght());

    }

    @DisplayName("Testing Password have lower Character")
    @Test

    public void testLowerCharacter() {
        testPassword = new CheckPassword("haseblind");
        //boolean actual = testPassword.checkLowerCase(testPassword.getPassword());
        assertTrue(testPassword.checkLowerCase());

    }

    @DisplayName("Testing Password have Upper Character")
    @Test

    public void testUpperCharacter(){
        testPassword = new CheckPassword("HASEBLIND");
        assertTrue(testPassword.checkUpperCase());

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


}