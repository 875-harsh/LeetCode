public class PractiseQues136 {
  public int singleNumber(int[] nums) {
    int sing=nums[0];
    for(int i=1;i<nums.length;i++){
      sing=sing^nums[i];
    }
    return sing;  
  }
}
