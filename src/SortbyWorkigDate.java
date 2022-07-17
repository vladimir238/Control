import java.util.Comparator;

public class SortbyWorkigDate implements Comparator <Worker>{
    @Override
    public int compare(Worker worker1, Worker worker2) {
                return worker1.getWorking_date().compareTo(worker2.getWorking_date());
    }
}
