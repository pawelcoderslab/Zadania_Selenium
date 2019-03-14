package Rest;

import org.testng.annotations.Test;

public class Main {
@Test
    public static void main(String[] args) {
        Rest rest = new Rest();

        rest.highestUserId();
        int a = rest.highestIdForUser(2);
        rest.RegistrationSuccessful(a);

    }




}
