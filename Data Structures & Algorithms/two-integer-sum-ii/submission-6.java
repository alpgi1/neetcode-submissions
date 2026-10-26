class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int l = 0, r = numbers.length-1;
        while(r>l){
            int sum = numbers[l]+numbers[r];
            if(sum == target) return new int[]{l+1,r+1};
            if(sum < target){
                l++;
            }else r--;
        }
        return null;
    }
}
