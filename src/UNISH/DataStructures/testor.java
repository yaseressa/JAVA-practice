package UNISH.DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class testor {
    static Integer i = 1;
    public static void main(String[] args) throws FileNotFoundException {
/*   Sets
   AtomicInteger j = new AtomicInteger(0);

        Set<String> g = new TreeSet();
        var in = new Scanner(new File("C:\\Users\\mee\\Desktop\\unknown.txt"));
        while(in.hasNext()){
            g.add(in.next());
        }

g.forEach((n)-> {

    System.out.println( j.incrementAndGet() + ". " + n);

});

 */

        Map< String, Integer> mapper = new TreeMap<>();
        mapper.put("ahmed", 237376);
        mapper.put("Omer", 45736);
        mapper.put("Ebrahem", 113737);
        mapper.put("Warsame", 19374);
        mapper.put("cali", 637376);
        mapper.put("muhiyadeen", 746365);
        mapper.put("abdullah", 11337387);
        mapper.put("mahamed", 2370806);
        mapper.put("zakariye", 45885736);
        mapper.put("Yaser", 113737);
        mapper.put("madar", 19374);

        int i = 0;
        for(Map.Entry<String, Integer> b : mapper.entrySet()){
            System.out.println(b);
        }



    }
}
