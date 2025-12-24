class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            //if stack is empty or a positve value arrives then perform blind insertion
            if(stack.isEmpty() || asteroids[i]>0){
                stack.push(asteroids[i]);
            } else {
                while(!stack.isEmpty()){
                    int top = stack.peek();
                    if(top<0){
                        stack.push(asteroids[i]);
                        break;
                    } 
                    int modVal = Math.abs(asteroids[i]);
                        if(modVal == top){
                            stack.pop();
                            break;
                        } else if(modVal < top){
                            break;
                        } else {
                            stack.pop();
                            if(stack.isEmpty()){
                                stack.push(asteroids[i]);
                                break;
                            }
                        }
                    
                }
            }
        }
        int len = stack.size();
        int ansArray[] = new int[len];
        for(int i=len-1;i>=0;i--){
            ansArray[i] = stack.pop();
        }
        return ansArray;
    }
}












