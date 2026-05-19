/*
This class is called PhoneTest
This test class contains:
-Test methods
-Object
-Action
-Result Verification
 */

package com.lorie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneTest {

    @Test
    public void testChargePhone(){
        //Create object
        Phone myPhone = new Phone("iPhone15", 50);

        // Do Action
        myPhone.chargePhone(20);

        // Verify result
       assertEquals(70, myPhone.getBattery());
    }
}
