package Tests;

import com.vunh.lab2.Login;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class LoginTest {
    @Test
    public void testLogin(){
        HashMap<String, String> account = new HashMap<>();
        account.put("Admin", "123");
        String expected = "Login successfully";
        Assert.assertEquals(expected, new Login().loginTo(account, "Admins", "123"));
    }
}
