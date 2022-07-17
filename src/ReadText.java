import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ReadText {
    OtherWorker otherWorker;

    public List<Worker> readText(String filename) throws IOException, ParseException {
        FileReader fr = new FileReader(filename);
        Scanner scan = new Scanner(fr);

        List<Worker> sc = new ArrayList<>();
        while (scan.hasNextLine()) {

            String txt = scan.nextLine();
            String[] res = txt.split(" ");

            if (res[5].equals("менеджер")) {
                sc.add(new MenegerWorker(Integer.valueOf(res[0]), res[1], res[2], reverceDate(res[3]), reverceDate(res[4]), res[5]));
            } else {
                sc.add(new OtherWorker(Integer.valueOf(res[0]), res[1], res[2], reverceDate(res[3]), reverceDate(res[4]), res[5], res[6]));
            }


        }

        fr.close();
        return sc;
    }

    public Date reverceDate(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yyyy");
        Date docDate = format.parse(date);

        return docDate;
    }

    public String unreverceDate(Date newDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return simpleDateFormat.format(newDate);
    }

    public void writeText(List<Worker> work) throws IOException {
        FileWriter writer = new FileWriter("src/file1.txt");

        for (Worker w : work) {
            if (w.getDescription().equals("менеджер")) {
                String bitrhday = unreverceDate(w.getBirthday());
                String working_date = unreverceDate(w.getWorking_date());
                writer.write(w.getId() + " " + w.getName() + " " + w.getLast_name() + " " +
                        bitrhday + " " + working_date + " " + w.getDescription() + "\n");
            } else {
                otherWorker = (OtherWorker) w;

                String bitrhday = unreverceDate(w.getBirthday());
                String working_date = unreverceDate(w.getWorking_date());
                writer.write(w.getId() + " " + w.getName() + " " + w.getLast_name() + " " +
                        bitrhday + " " + working_date + " " + w.getDescription() + " "  +
                        otherWorker.getManager() + "\n");
            }

        }
        writer.close();
    }
    public  void addNewWorker() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое  ");
        String text = in.nextLine();

        System.out.println("Вы ввели строку %d \n" + text);
        in.close();

    }


}
