import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>list=new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            int value=entry.getKey();
            int count=entry.getValue();
            if (count>1){
                list.add(value);
            }
        }
        return list;
    }
}