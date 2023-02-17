package JavaOOP_Ds5.Core.CustomExceptions;

public class BadEmailException extends Exception
{
    public BadEmailException()
    {
        super("Вы ввели неверный адрес электронной почты");
    }
}