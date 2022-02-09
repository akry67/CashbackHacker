package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest{

    @Test
    public void cash900() {
     CashbackHackService cashbackHackService = new CashbackHackService();
     int amount = 900;

     int expected = 100;
     int actual = cashbackHackService.remain(900);

     Assert.assertEquals(expected, actual);
    }

    @Test
    public void cashBackOn1000() {
        // падать не должен. пользователь и так накупил на 1000.
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(1000);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void cashBackOn100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 100;

        int expected = 900;
        int actual = cashbackHackService.remain(100);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void cashBackOnNull() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = cashbackHackService.remain(0);

        Assert.assertEquals(expected, actual);

    }

}