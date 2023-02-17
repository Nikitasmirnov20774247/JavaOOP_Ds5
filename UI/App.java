package JavaOOP_Ds5.UI;

import java.util.Scanner;

import JavaOOP_Ds5.Core.DB.ExternalContactsCSV;
import JavaOOP_Ds5.Core.DB.ExternalData;
import JavaOOP_Ds5.Core.MVP.Model;
import JavaOOP_Ds5.Core.MVP.Presenter;
import JavaOOP_Ds5.Core.MVP.View;
import JavaOOP_Ds5.Core.Models.PhoneBook;
import JavaOOP_Ds5.Core.Models.PhoneBookMap;

public class App
{
    public static void Run()
    {
        Scanner iScanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBookMap();
        ExternalData db = new ExternalContactsCSV(phoneBook, "JavaOOP_Ds5/db.csv");
        Model model = new Model(phoneBook, db);
        View view = new ConsoleUI(iScanner);
        Presenter presenter = new Presenter(model, view);

        presenter.load();
        presenter.mainMenu();
        presenter.save();

        iScanner.close();
    }
}