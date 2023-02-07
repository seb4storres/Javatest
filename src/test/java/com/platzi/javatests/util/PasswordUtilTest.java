package com.platzi.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weakWhenHasLessThan8Letters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPasword("1234567"));
    }
    @Test
    public void weakWhenHasOnlyLetters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPasword("abcd2!"));
    }
    @Test
    public void mediumWhenHasLettersandNumbers() {
        assertEquals(PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assessPasword("abcdfgh1234"));
    }
    @Test
    public void strongWhenHasLettersSymbolsandNumbers() {
        assertEquals(PasswordUtil.SecurityLevel.STRONG, PasswordUtil.assessPasword("abcd1234!"));
    }
}