import java.util.Date;

class MenegerWorker extends Worker {

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