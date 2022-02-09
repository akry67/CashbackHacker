package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void cashBackOn900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = cashbackHackService.remain(900);

        assertEquals(actual, expected);

    }

    @Test
    public void cashBackOn1000() {
        // падать не должен. пользователь и так накупил на 1000.
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(1000);

        assertEquals(actual, expected);

    }

    @Test
    public void cashBackOn100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 100;

        int expected = 900;
        int actual = cashbackHackService.remain(100);

        assertEquals(actual, expected);

    }

    @Test
    public void cashBackOnNull() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = cashbackHackService.remain(0);

        assertEquals(actual, expected);

    }

}