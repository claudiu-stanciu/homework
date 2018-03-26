package org.mcreynolds.homework;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cs186081 on 26/03/2018.
 */
public class TestPasswordValidator2 {

    @Test
    public void validPass() {
        String password = "Ab1!@#";
        assertTrue(PasswordValidator2.isValid(password));
        password = "Ab1##";
        assertTrue(PasswordValidator2.isValid(password));
        password = "Abcd1!@#";
        assertTrue(PasswordValidator2.isValid(password));
    }

    @Test
    public void notValidNumChars(){
        String password = "aB1%";
        assertFalse(PasswordValidator2.isValid(password));
    }

    @Test
    public void notValidSpecialChars(){
        String password = "Ka41jn+=";
        assertFalse(PasswordValidator2.isValid(password));
    }

    @Test
    public void notValidNoDiversity(){
        String password = "asSFD!#";
        assertFalse(PasswordValidator2.isValid(password));
        password = "askmess";
        assertFalse(PasswordValidator2.isValid(password));
        password = "234345";
        assertFalse(PasswordValidator2.isValid(password));
        password = "^&%^$%#";
        assertFalse(PasswordValidator2.isValid(password));
    }
}
