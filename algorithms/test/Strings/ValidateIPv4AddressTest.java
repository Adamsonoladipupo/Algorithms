package Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateIPv4AddressTest {
    @Test
    void checkAValidIPv4AddressTestOne(){
        String ip = "128.0.0.1";
        assertTrue(ValidateIPv4Address.validate(ip));
    }

    @Test
    void checkAnInvalidIPv4AddressTestTwo(){
        String ip = "125.512.100.1";
        assertFalse(ValidateIPv4Address.validate(ip));
    }
}