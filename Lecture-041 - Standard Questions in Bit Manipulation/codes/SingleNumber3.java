public class SingleNumber3 {
        public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num : nums){
            xor = xor ^ num;
        }
        int rsb = xor & (-xor);
        int xorA=0;
        int xorB=0;
        for(int num : nums){
            if((num & rsb)!=0){
                xorA = xorA ^ num;
            }else{
                xorB = xorB ^ num;
            }
        }
        return new int[]{xorA,xorB};
    }
}
