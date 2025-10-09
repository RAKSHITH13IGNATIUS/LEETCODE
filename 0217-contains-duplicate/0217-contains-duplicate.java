class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> ns = new HashSet<>();
        for(int num : nums){
            if(ns.contains(num)){
                return true;     
           }
           ns.add(num);
    }
     return false; 
    }
}