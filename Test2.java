import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String args[]){
        Map<String,Integer> classStrength = new HashMap<String, Integer>();
        classStrength.put("1st",100);
        classStrength.put("2nd",200);
        classStrength.put("3",300);

        System.out.println("Total No of Classes:"+classStrength.size());
        for(Map.Entry m:classStrength.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }


    }
}
