import java.util.Comparator;

public class SortbyBirthday implements Comparator <Worker>{
    @Override
    public int compare(Worker worker1, Worker worker2) {
                return worker1.getBirthday().compareTo(worker2.getBirthday());
    }
}
