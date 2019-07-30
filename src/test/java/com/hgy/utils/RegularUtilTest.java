package com.hgy.utils;

import com.hgy.beans.Employee;

import static org.junit.Assert.*;

public class RegularUtilTest {

    @org.junit.Test
    public void filterAndLoadAEmployee() {
        //given
        String contentJohn = "Doe, John, 1982/10/08, john,doe@foobar.com";
        String contentMary = "Ann, Mary, 1975/09/11, mary.ann@foobar.com";
        Employee employee = new Employee();
        //when
        boolean JohnSame = RegularUtil.filterAndLoadAEmployee(contentJohn, employee);
        boolean MarySame = RegularUtil.filterAndLoadAEmployee(contentMary, employee);
        //then
        assertFalse(JohnSame);
        assertTrue(MarySame);
    }
}