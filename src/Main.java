import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException, ParseException {
        OtherWorker otherWorker = null;
        printNavigation();
    //    List<Worker> workers = new ArrayList<Worker>();

        ReadText readtext = new ReadText();
        List<Worker> arrWork = readtext.readText("src/file1.txt");
        Collections.sort(arrWork, new SortbyBirthday());
        readtext.writeText(arrWork);
        for (Worker w : arrWork) {
           if(w.getDescription().equals("менеджер")){
            System.out.println(w);
        }else {
               otherWorker = (OtherWorker) w;
               System.out.println(otherWorker.getManager());
           }
           }


    }

    private static void command(String string) throws IOException {

        //     System.out.println(String.format("Какое действие хотите выполнить ?");
        //Метод для вывода меню
        printNavigation();

        //Варианты для команд
        switch (string) {
            case "1": {
                System.out.println("Показать список всех сотрудников");
                //    command(br.readLine());
            }
            break;
            case "2": {
                System.out.println("Добавить нового сотрудника");
            }
            break;
            case "7":

                System.exit(1);
                break;
            case "да":
                command("2");
                break;
            case "нет": {
                printNavigation();
                //    command(br.readLine());
            }
        }
        //Снова ждем команды от пользователя
        // command(br.readLine());
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

}


