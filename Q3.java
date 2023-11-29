import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Q3 {
    public static  class Pair implements Comparable<Pair>{
        String s;
        int count;
        Pair(String s,int count)
        {
            this.s=s;
            this.count=count;
        }
        public  int compareTo(Pair o)
        {
            return o.count-this.count;
        }
    }
    public static void main(String args[])
    {
        String csv="input.csv";
        HashMap<String,Integer>hm=new HashMap<>();
        try (Scanner sc = new Scanner(new File(csv))) {
            sc.useDelimiter(",|\\s+"); 

            while (sc.hasNext()) {
               
                String word = sc.next().trim().toLowerCase();

                // Update word count in the HashMap
                hm.put(word, hm.getOrDefault(word, 0) + 1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        for(String s:hm.keySet())
        {
            pq.add(new Pair(s,hm.get(s)));
        }
        int over=3;
        while(pq.size()>0&&over>=0)
        {
            Pair tmp=pq.remove();
            System.out.println(tmp.s);
            --over;
        }

    }
}
