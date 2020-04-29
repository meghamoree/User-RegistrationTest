
import java.util.regex.Pattern;

    public class Registration {
        String FirstNamePattern="^[A-Z][a-zA-Z]{2,}$";
        String LastNamePattern="^[A-Z][a-zA-Z]{2,}$";

        public boolean checkFirstName(String FirstName) {
            return Pattern.matches(FirstNamePattern,FirstName);
        }
            public boolean checkLastName(String LastName) {
                return Pattern.matches(LastNamePattern,LastName);
        }
}
