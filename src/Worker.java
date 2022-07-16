import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;
import java.util.Locale;

abstract class Worker  {
    private int id;
    private String name;
    private String last_name;
    private Date birthday;
    private Date working_date;

    Worker(int id, String name, String last_name, Date birthday, Date working_date) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.birthday = birthday;
        this.working_date = working_date;

    }

    String getLast_name() {
        return last_name;
    }

    Date getBirthday() {

        return birthday;
    }

    Date getWorking_date() {
        return working_date;
    }

    public int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    abstract String getDescription();

    @Override
    public String toString() {
        return "#" + id + " " + name + " " + last_name + " День рождения " + birthday + " Дата принятия на работу " + working_date;
    }


}
