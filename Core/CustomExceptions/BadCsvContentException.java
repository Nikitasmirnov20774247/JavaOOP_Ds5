package JavaOOP_Ds5.Core.CustomExceptions;

public class BadCsvContentException extends Exception
{
    public BadCsvContentException()
    {
        super("Указан недопустимый CSV-файл, не удается загрузить телефонную книгу");
    }
}