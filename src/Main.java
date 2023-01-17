import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(-5);
        set.add(8);
        set.add(-9);
        set.add(13);
        boolean a = hasOdd(set);
        System.out.println(a);
    }
    static boolean  hasOdd(Set<Integer> set){
        if(set.size()==0) return false;
        for(int i:set){
            if(i<0) return true;
        }
        return false;
    }
}