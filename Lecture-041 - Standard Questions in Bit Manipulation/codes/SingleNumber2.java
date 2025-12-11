public class SingleNumber2 {
        public int singleNumber(int[] nums) {
        int res=0;
        // 32*N
        for(int i=0;i<32;i++){
            int bitCount=0;
            for(int num : nums){
                if((num & (1<<i))!=0){ //just checking if ith bit was set in num
                    bitCount++;
                }
            }
            if(bitCount%3!=0){ //set the ith bit if count is not divisible by 3
                res = res | (1<<i);
            }
        }
        return res; 
    }
}
