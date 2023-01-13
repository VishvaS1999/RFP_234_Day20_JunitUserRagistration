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
    @Test
    public void mobileNumber()
    {
        String mobileNumber = "91 7359231256";
        boolean check = userRegistration.checkMobileNumberFormatIsCorrect(mobileNumber);
        Assert.assertTrue(check);
    }
    @Test
    public void passWordRule1()
    {
        String rull1 = "gVishvas";
        boolean check = userRegistration.checkPassWordRule1IsCorrect(rull1);
        Assert.assertTrue(check);
    }
    @Test
    public void passWordRule2(){
        String rull2 = "Gvishvas";
        boolean check = userRegistration.checkPassWordRule2IsCorrect(rull2);
        Assert.assertTrue(check);
    }
    @Test
    public void passWordRule3(){
        String rull3 = "Gvishvas1";
        boolean check = userRegistration.checkPassWordRule3IsCorrect(rull3);
        Assert.assertTrue(check);
    }
    @Test
    public void passWordRule4(){
        String rull4 = "Gvishvas1@";
        boolean check = userRegistration.checkPassWordRule4IsCorrect(rull4);
        Assert.assertTrue(check);
    }
}
