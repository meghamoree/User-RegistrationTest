import org.junit.Assert;
import org.junit.Test;


    public class RegistrationTest {
        Registration obj = new Registration();

        @Test
        public void givenfirstName_whenValid_thenTrue() {
            boolean firstname = obj.checkName("Megha");
            Assert.assertTrue(firstname);
        }

        @Test
        public void givenfirstName_whenInValid_thenFalse() {
            boolean firstname = obj.checkName("Me");
            Assert.assertFalse(firstname);
        }


}
