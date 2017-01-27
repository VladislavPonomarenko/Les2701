import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by java-1-05 on 27.01.2017.
 */
public class Main {
    public static final long ITERATION=1000L;

    public static void main(String[] args) {
        List<Tank> tankArrayList = new ArrayList<Tank>();
        List<Tank> tankLinkedList = new LinkedList<Tank>();
        calkTime(tankArrayList);
        calkTime(tankLinkedList);
    }

    public static void calkTime(List<Tank>list) {
        long begintime = System.currentTimeMillis();
        fillList(list);
        System.out.println("Time"+(System.currentTimeMillis()-begintime));
    }

    public static void fillList(List list) {
        for (int i = 0; i <ITERATION ; i++) {
            list.add(new Tank());
        }

    }


}
