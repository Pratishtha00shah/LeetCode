class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        int n = nums.length;

        //sorting the array
        Arrays.sort(nums);

        for(int i = 0; i < n - 2 ; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue; //skip the duplicates value
            }

            int left =  i + 1;
            int right =  n - 1;

            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];

                if(currSum == 0) {
                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));

                      // Skip duplicates
                    while(left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while(left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (currSum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return triplets;
    }
}

