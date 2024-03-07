import com.example.servlethelloworld.LoginModel;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLogin {
    private final HashMap<String, String> data = new HashMap<String, String>();

    @Test //Login Successfully 1-1
    public void testLogin() throws Exception {
        this.data.put("Admin", "123");
        this.data.put("Customer", "123");
        this.data.put("Employee", "123");
        String login = LoginModel.loginHashMap(this.data, "Admin", "123");
        assertEquals("Login to Admin", login);
    }

    @Test //Login failed 1-0
    public void testLogin1_0() throws Exception {
        this.data.put("Admin", "123");
        this.data.put("Customer", "321");
        this.data.put("Employee", "231");
        String login = LoginModel.loginHashMap(this.data, "Customer", "3221");
        assertEquals("Login failed", login);
    }

    @Test//Not found 0-0
    public void testLogin1_1() throws Exception {
        this.data.put("Admin", "123");
        this.data.put("Customer", "321");
        this.data.put("Employee", "231");
        String login = LoginModel.loginHashMap(this.data, "Admins", "3221");
        assertEquals("Account not found", login);
    }

    @Test//Not found 0-1
    public void testLogin1_2() throws Exception {
        this.data.put("Admin", "123");
        this.data.put("Customer", "321");
        this.data.put("Employee", "231");
        String login = LoginModel.loginHashMap(this.data, "Hacker", "123");
        assertEquals("Account not found", login);
    }

    @Test//Not found -1 - -1
    public void testLogin1_3() throws Exception {
        this.data.put("Admin", "123");
        this.data.put("Customer", "321");
        this.data.put("Employee", "231");
        String login = LoginModel.loginHashMap(this.data, null, null);
        assertEquals("Account not found", login);
    }
}
