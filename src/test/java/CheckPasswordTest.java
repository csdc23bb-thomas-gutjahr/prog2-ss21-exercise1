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
        Boolean actual = testPassword.calcLenght(testPassword.getPassword());
        Boolean expected = true;
        assertEquals(actual,expected);

    }

    @DisplayName("Testing Password to Short")
    @Test

    public void testToShortPassword(){
        testPassword = new CheckPassword("Hase"); //Define Password
        assertFalse(testPassword.calcLenght(testPassword.getPassword()));

    }

    @DisplayName("Testing Password to Long")
    @Test

    public void testToLongPassword(){
        testPassword = new CheckPassword("HaseBlindAmSeeMitStockInDerHandOhneAugenschmausFliegtaufFlieger"); //Define Password
        assertFalse(testPassword.calcLenght(testPassword.getPassword()));

    }


}
