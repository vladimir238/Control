import java.time.LocalDate;
import java.util.Date;

abstract class Worker  {
    private int id;
    private String name;
    private String last_name;
    private LocalDate birthday;
    private LocalDate working_date;

    Worker(int id, String name, String last_name, LocalDate birthday, LocalDate working_date) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.birthday = birthday;
        this.working_date = working_date;

    }

    String getLast_name() {
        return last_name;
    }

    LocalDate getBirthday() {

        return birthday;
    }

    LocalDate getWorking_date() {
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
