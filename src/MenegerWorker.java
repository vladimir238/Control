import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

class MenegerWorker extends Worker {
    //   static final double WORKING_HOURS_IN_MONTH = 8.0 * 20.8;

    String status;

    public MenegerWorker(int id, String name, String last_name, Date birthday, Date working_date, String status) {
        super(id, name, last_name, birthday, working_date);
        this.status = status;
    }


    @Override
    String getDescription() {
        return status;
    }

    @Override
    public String toString() {

        return super.toString() + " " + getDescription();
    }

}