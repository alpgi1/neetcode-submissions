class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int f = numbers.length-1;
        while(f > i){
            if(numbers[i] + numbers[f] == target) return new int []{i+1,f+1};
            if(numbers[i] + numbers[f] > target){
                f--;
            }
           else if(numbers[i] + numbers[f] < target){
                i++;
            }
        }
        return new int []{};
    }
}
