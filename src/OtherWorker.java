import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

class OtherWorker extends Worker {
    String description,manager;


    public OtherWorker(int id, String name, String last_name, Date birthday, Date working_date, String description, String manager ) {
        super(id, name, last_name, birthday, working_date);
        this.description = description;
        this.manager = manager;

    }

    public String getManager() {
        return manager;
    }

    @Override
    String getDescription() {
        return description;
    }

    @Override
    public String toString() {

        return super.toString() + " Должность  " + getDescription()+ " Руководитель " + getManager();
    }
}