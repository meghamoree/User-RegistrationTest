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



    }
