package junitUserRagistration;


import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest
{
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void firstName()
    {
        String firstName = "Vishva";
        boolean check = userRegistration.checkFirstNameIsCorrect(firstName);
        Assert.assertTrue(check);
    }

    @Test
    public void lastName()
    {
        String lastName = "Santoki";
        boolean check = userRegistration.checkLastNameIsCorrect(lastName);
        Assert.assertTrue(check);
    }

    @Test
    public void eMAil()
    {
        String eMail = "janani@bl.co";
        boolean check = userRegistration.checkEmailIsCorrect(eMail);
        Assert.assertTrue(check);
    }
}
