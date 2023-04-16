import java.util.HashSet;
import java.util.Iterator;
public class hash{
public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(1);
    System.out.println(set);
    set.remove(1);
    int a=set.size();
    System.out.println(set);
    System.out.println(a);
    Iterator it = set.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    if(set.contains(7)){
        System.out.println("present");
    }
    else{
    System.out.println("Not present");
    }
}
}