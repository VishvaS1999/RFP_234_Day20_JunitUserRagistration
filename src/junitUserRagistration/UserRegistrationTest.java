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
}
