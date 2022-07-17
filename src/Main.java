import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;

public class Main {
    private static BufferedReader br;
    //private static BufferedReader fr;
    private static List<Worker> arrWork;

    public static void main(String[] args) throws IOException, ParseException {
        br = new BufferedReader(new InputStreamReader(System.in));
        ReadText readtext = new ReadText();
        arrWork = readtext.readText("src/file1.txt");
        //    OtherWorker otherWorker = null;
        printNavigation();
        try {
            command(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void command(String string) throws IOException, ParseException {
//        ReadText readtext = new ReadText();
//        arrWork = readtext.readText("src/file1.txt");


        //Варианты для команд
        switch (string) {
            case "1": {
                addNewWorker();
                System.out.println("Вы Добавили нового сотрудника");

                printNavigation();
                command(br.readLine());
            }
            break;
            case "2": {
                System.out.println("Сотрудник удален");
                printNavigation();
                command(br.readLine());
            }
            break;
            case "3": {
                System.out.println("Профессия сотрудника изменена");
                printNavigation();
                command(br.readLine());
            }
            break;
            case "4": {
                System.out.println("Сотрудник привязан к менеджеру");
                printNavigation();
                command(br.readLine());
            }
            break;
            case "5": {

                Collections.sort(arrWork, new SortbyName());
                printCollection();
                printNavigation();
                command(br.readLine());
            }
            break;
            case "6": {
                Collections.sort(arrWork, new SortbyWorkigDate());
                printCollection();
                printNavigation();
                command(br.readLine());
            }
            break;
            case "7": {
                System.exit(1);
            }
            break;

        }

        command(br.readLine());
    }


    private static void printNavigation() {
        System.out.println("Какое действие хотите выполнить ?");
        System.out.println("1. Добавить нового сотрудника");
        System.out.println("2. Удалить сотрудника");
        System.out.println("3. Изменить профессию сотрудника");
        System.out.println("4. Привязать сотрудника к менеджеру");
        System.out.println("5. Сортировать список по фамилиям");
        System.out.println("6. Сортировать список по датам принятия на работу");
        System.out.println("7. Выход из программы");
    }

    public static void printCollection() {
        for (Worker w : arrWork) {
            System.out.println(w);
        }
    }

    public static void addNewWorker() throws IOException, ParseException {


        System.out.println("Введите через пробел id сотрудника Имя Фамилию Дату рождения Дату принятия на работу Должность Непосредственный руководитель");
        String rf = br.readLine();
        addListWorker(rf);
        System.out.println("Вы ввели сотрудника " + rf);
        command(br.readLine());


    }

    public static void addListWorker(String inf) throws ParseException {
        ReadText readText = new ReadText();
        String[] res = inf.split(" ");

        if (res[5].equals("менеджер")) {
            arrWork.add(new MenegerWorker(Integer.valueOf(res[0]), res[1], res[2], readText.reverceDate(res[3]), readText.reverceDate(res[4]), res[5]));
        } else {
            arrWork.add(new OtherWorker(Integer.valueOf(res[0]), res[1], res[2], readText.reverceDate(res[3]), readText.reverceDate(res[4]), res[5], res[6]));
        }

        printCollection();


    }

}


