import java.time.LocalDate;
import java.util.Date;

class OtherWorker extends Worker {
    String description,manager;


    public OtherWorker(int id, String name, String last_name, LocalDate birthday, LocalDate working_date, String description, String manager ) {
        super(id, name, last_name, birthday, working_date);
        this.description = description;
        this.manager = manager;

    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setDescription(String description) {
        this.description = description;
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