import java.util.*;
public class Q2 {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		ArrayList<String>a=new ArrayList<>();
		HashSet<String>hs=new HashSet<>();
		HashMap<String,Integer>hm=new HashMap<>();
		for(int i=0;i<10;i++)
		{
		    String tmp=sc.next();
		    a.add(tmp);
		    hs.add(tmp);
		    hm.put(tmp,hm.getOrDefault(tmp,0)+1);
		    
		}
		System.out.println();
		System.out.println("List Contains:");
		System.out.println();
		for(String s:a)
		System.out.println(s);
		System.out.println();
		System.out.println("Set Contains:");
		System.out.println();
		for(String s:hs)
		System.out.println(s);
		System.out.println();
		System.out.println("Frequency of Words:");
		System.out.println();
		for(String s:hm.keySet())
		{
		    System.out.println("Word="+s+",Frequency="+hm.get(s));
		}
        sc.close();

}
}
