import java.util.Scanner;
class captchaException extends Exception
{
    public captchaException(String s)
    {
        super(s);
    }
}


class OwnException
{
    void CheckCaptcha(int captcha) throws captchaException
    {
        if(captcha != 5)
        {
            throw new captchaException("Validation Failed Invalid Captcha");
        }
        else
        {
            System.out.println("Validation successful");
        }
    }


    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Validate Captcha - 2+3 = ");
        int captcha = sc.nextInt();
        OwnException emp = new OwnException();
        try
        {
            emp.CheckCaptcha(captcha);
        }
        catch (captchaException e)
        {
            System.out.println("Invalid Input Exception Caught");
        }
        finally {
            System.out.println("End of the code");
        }

    }
}