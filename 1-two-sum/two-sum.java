class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>mpp=new HashMap();
        for(int i=0;i<nums.length;i++){
            int k=target-nums[i];
            if(mpp.containsKey(k)){
                return new int[]{mpp.get(k),i};
            }
            mpp.put(nums[i],i);
        }
        return null;
    }
}