//Github Link:      https://github.com/Yddgrasil/prog2-ss21-exercise1
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class checkPassword {
    @BeforeAll
    public static void init(){
        System.out.println("Testing Your Password");
    }

    @AfterAll
    public static void finish(){
        System.out.println("Finished Testing Your Password");
    }




    @Test
    public void TestPasswordnlyUpper()
    {
        String PasswordUppercase = "GDHJ$GHA3SFDG";

        assertFalse(Password.checkPassword(PasswordUppercase));

    }

    @Test
    public void TestPasswordOnlyLower()
    {
        String PasswordLowercase = "ahsj$dh4asdf";

        assertFalse(Password.checkPassword(PasswordLowercase));

    }

    @Test
    public void TestPasswordUpperAndLower()
    {
        String PasswordHasUpperAndLowercase= "DHJAQjh5a$sjdhk";

        assertTrue(Password.checkPassword(PasswordHasUpperAndLowercase));

    }



    @Test
    public void TestPasswordTooLong() {

        String PasswordLong ="adfg5Sdkf$jieurioaisjfkdskh83498238574";

        assertFalse(Password.checkPassword(PasswordLong));
    }

    @Test
    public void TestPasswordTooShort() {
        String PasswordShort = "sd$F4";

        assertFalse(Password.checkPassword(PasswordShort));
    }

    @Test
    public void TestPasswordGoodLength() {
        String PasswordRightLength = "abcSd$fas5dfe";

        assertTrue(Password.checkPassword(PasswordRightLength));
    }


    @Test
    public void PasswordContainsNumber(){
        String PasswordWithNumber ="hsadjfhas$jfh837HJ";

        assertTrue(Password.checkPassword(PasswordWithNumber));
    }

    @Test
    public void PasswordContainsNONumber(){
        String PasswordNoNumber= "sadjfhdk$jasfhHashdfj";

        assertFalse(Password.checkPassword(PasswordNoNumber));
    }

    @Test
    public void PasswordContainsSpecialCharacter(){
        String PasswordWithSpecialCharacter ="sadjfkhR%hj5Dhkjdsjf@";

        assertTrue(Password.checkPassword(PasswordWithSpecialCharacter));
    }

    @Test
    public void PasswordNoSpecialCharacter(){
        String PasswordNotSpecial="asdjfhdskjahkd4WjshafkjZ&";

        assertFalse(Password.checkPassword(PasswordNotSpecial));
    }


    @Test
    public void PasswordIllegalSpecialCharacterEuro(){
        String PasswordWrongSpecialCharacter ="sadjfkhR%hj5Dhkjds€jf@";
        assertFalse(Password.checkPassword(PasswordWrongSpecialCharacter));
    }

    @Test
    public void PasswordIllegalgSpecialCharacterTilde(){
        String PasswordWrongSpecialCharacter ="sadjfkhR%hj5D~hkjds€jf@";

        assertFalse(Password.checkPassword(PasswordWrongSpecialCharacter));
    }

    @Test
    public void PasswordIllegalgSpecialCharacterSmallerThan(){
        String PasswordWrongSpecialCharacter ="sadjfkhR%hj5D~h<kjds€jf@";

        assertFalse(Password.checkPassword(PasswordWrongSpecialCharacter));
    }

    @Test
    public void PasswordIllegalgSpecialCharacterBiggerThan(){
        String PasswordWrongSpecialCharacter ="sadjfkhR%hj>5D~h<kjds€jf@";

        assertFalse(Password.checkPassword(PasswordWrongSpecialCharacter));
    }


    @Test
    public void PasswordWithConsecutiveNumbers(){
        String PasswordConsecutive ="sadjfkhR%hj>5D~h<123kjds€jf@";

        assertFalse(Password.checkPassword(PasswordConsecutive));
    }

    @Test
    public void PasswordNoConsecutiveNumbers(){
        String PasswordConsecutive ="sadjfkhR%hj>5D~h<132kjds€jf@";

        assertFalse(Password.checkPassword(PasswordConsecutive));
    }


    public void PasswordHasConsecutiveNumbers(){
        String PasswordWithConsecutiveNumbers="hasdkjfhs@A5jksadfk123";

        assertFalse(Password.checkPassword(PasswordWithConsecutiveNumbers));

    }

    public void PasswordHasNoConsecutiveNumbers(){
        String PasswordWithNoConsecutiveNumbers="ufasidfuJUKJ@8901jdk";

        assertTrue(Password.checkPassword(PasswordWithNoConsecutiveNumbers));


    }

    public void PasswordHasNoSameNumbers(){
        String PasswordWithNoConsecutiveNumbers="ufasidfuJUK111J@8901jdk";

        assertTrue(Password.checkPassword(PasswordWithNoConsecutiveNumbers));

    }

    public void PasswordHasSameNumbers(){
        String PasswordWithConsecutiveNumbers="hasdkj1111fhs@A5jksadfk123";

        assertFalse(Password.checkPassword(PasswordWithConsecutiveNumbers));

    }


}
