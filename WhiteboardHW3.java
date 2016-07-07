public int[] rotateLeft3(int[] nums) {
  int holder = 0;
  
  holder = nums[0];
  nums[0] = nums [1];
  nums[1] = nums [2];
  nums[2] = holder;
  
  return nums;
}