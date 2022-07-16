import java.util.Comparator;

public class SortbyName implements Comparator<Worker> {


    @Override
    public int compare(Worker worker1, Worker worker2) {
                return  worker1.getName().compareTo(worker2.getName());
    }
}
