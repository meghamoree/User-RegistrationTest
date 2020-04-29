import org.junit.Assert;
import org.junit.Test;


    public class RegistrationTest {
        Registration registration = new Registration();

        @Test
        public void givenfirstName_whenValid_thenTrue() {
            boolean result = registration.checkFirstName("Megha");
            Assert.assertTrue(result);
        }
        @Test
        public void givenfirstName_whenInValid_thenFalse() {
            boolean result = registration.checkFirstName("Me");
            Assert.assertFalse(result);
        }
        @Test
        public void givenlastName_whenValid_thenTrue() {
            boolean lastname = registration.checkLastName("More");
            Assert.assertTrue(lastname);
        }

        @Test
        public void givenlastName_wheninValid_thenFalse() {
            boolean lastname = registration.checkLastName("Mo");
            Assert.assertFalse(lastname);
        }

        @Test
        public void givenEmail_whenValid_thenTrue() {
            boolean result = registration.checkEmail("meghamoree@gmail.com");
            Assert.assertTrue(result);
        }
        @Test
        public void givenEmail_wheninValid_thenFalse() {
            boolean result = registration.checkEmail("$123@gmail.com");
            Assert.assertFalse(result);
        }

        @Test
        public void givenMobileNumber_whenValid_thenTrue() {
            boolean result=registration.checkMobileNumber("91 9340747351");
            Assert.assertTrue(result);
        }

        @Test
        public void givenMobileNumber_whenNotValid_thenFalse() {
            boolean result=registration.checkMobileNumber("988888855");
            Assert.assertFalse(result);
        }
        @Test
        public void givenPassword_whenValid_thenTrue(){
            boolean result=registration.checkPassword("Megha@123");
            Assert.assertTrue(result);
        }

        @Test
        public void givenPassword_whenInvalid_thenFalse() {
            boolean result=registration.checkPassword("Megha@#1");
            Assert.assertFalse(result);
        }

    }
