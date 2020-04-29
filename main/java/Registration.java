
import java.util.regex.Pattern;

    public class Registration {
        String FirstNamePattern="^[A-Z][a-zA-Z]{2,}$";

        public boolean checkName(String FirstName) {

            return Pattern.matches(FirstNamePattern,FirstName);
        }
}
