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
        System.out.println("...............................................................");
    }
    @Test
    public void lastName()
    {
        String lastName = "Santoki";
        boolean check = userRegistration.checkLastNameIsCorrect(lastName);
        Assert.assertTrue(check);
        System.out.println("...............................................................");
    }
    @Test
    public void eMAil()
    {
        String eMail = "janani@bl.co";
        boolean check = userRegistration.checkEmailIsCorrect(eMail);
        Assert.assertTrue(check);
        System.out.println("...............................................................");
    }
    @Test
    public void mobileNumber()
    {
        String mobileNumber = "91 7359231256";
        boolean check = userRegistration.checkMobileNumberFormatIsCorrect(mobileNumber);
        Assert.assertTrue(check);
        System.out.println("...............................................................");
    }
    @Test
    public void passWordRule1()
    {
        String rull1 = "gVishvas";
        boolean check = userRegistration.checkPassWordRule1IsCorrect(rull1);
        Assert.assertTrue(check);
        System.out.println("...............................................................");
    }
    @Test
    public void passWordRule2(){
        String rull2 = "Gvishvas";
        boolean check = userRegistration.checkPassWordRule2IsCorrect(rull2);
        Assert.assertTrue(check);
        System.out.println("...............................................................");
    }
    @Test
    public void passWordRule3(){
        String rull3 = "Gvishvas1";
        boolean check = userRegistration.checkPassWordRule3IsCorrect(rull3);
        Assert.assertTrue(check);
        System.out.println("...............................................................");
    }
    @Test
    public void passWordRule4(){
        String rull4 = "Gvishvas1@";
        boolean check = userRegistration.checkPassWordRule4IsCorrect(rull4);
        Assert.assertTrue(check);
        System.out.println("...............................................................");
    }
    @Test
    public void HappyAndSadCasesForFirstName(){
        String firstName = "Vishva";
        String firstName1 = "vis";
        boolean check = userRegistration.checkFirstNameIsCorrect(firstName);
        Assert.assertTrue(check);
        check = userRegistration.checkFirstNameIsCorrect(firstName1);
        Assert.assertTrue(check);
    }
    @Test
    public void HappyAndSadCasesForLasstName(){
        String lastName = "Santoki";
        String lastName1 = "san";
        boolean check = userRegistration.checkLastNameIsCorrect(lastName);
        Assert.assertTrue(check);
        check = userRegistration.checkLastNameIsCorrect(lastName1);
        Assert.assertTrue(check);
    }
    @Test
    public void HappyAndSadCasesForMobileFormat(){
        String mobileNumber = "91 7359231256";
        String mobileNumber1 = "7359231256";
        boolean check = userRegistration.checkMobileNumberFormatIsCorrect(mobileNumber);
        Assert.assertTrue(check);
        check = userRegistration.checkMobileNumberFormatIsCorrect(mobileNumber1);
        Assert.assertTrue(check);
    }
    @Test
    public void HappyAndSadCasesForEmail() {
        String eMail = "janani@bl.co";
        String eMail1 = "janani@.co";
        boolean check = userRegistration.checkEmailIsCorrect(eMail);
        Assert.assertTrue(check);
        check = userRegistration.checkEmailIsCorrect(eMail1);
        Assert.assertTrue(check);
    }
}
