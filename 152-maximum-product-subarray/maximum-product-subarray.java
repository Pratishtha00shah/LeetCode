class Solution {
    public int maxProduct(int[] nums) {
       int CurMax = 1;
       int CurMin = 1;
       int result = nums[0];

       for (int i : nums){
          int value1 = Math.max(Math.max(i, i*CurMax), i*CurMin);
          int value2 = Math.min(Math.min(i, i*CurMax), i*CurMin);

          CurMax = value1;
          CurMin = value2;

          result = Math.max(result, CurMax);
      }
      return result;
   }
}