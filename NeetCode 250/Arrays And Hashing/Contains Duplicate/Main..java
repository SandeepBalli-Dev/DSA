
import java.util.HashSet;
import java.util.Set;

class Main {

    // Leetcode - 217 https://leetcode.com/problems/contains-duplicate/description/
    
     public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }
}