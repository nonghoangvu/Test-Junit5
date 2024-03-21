package com.vunh.repositories;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AccountRespTest {
    private final AccountResp accountResp = new AccountResp();


    @Test
    void loginSuccess() {
        assertEquals("Nong Hoang Vu", accountResp.login("0777049085", "1234567").getFullName());
    }

    @Test
    void loginNotFound() {
        assertEquals(null, accountResp.login("+84 777049085", "1234567"));
    }

    @Test
    void loginNumberPhoneTooLong() {
        assertThrows(IllegalArgumentException.class, () -> accountResp.login("07770490850000", "1234567"));
    }

}