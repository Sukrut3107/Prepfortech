class Solution {
    public boolean isPowerOfTwo(int n) {
         if(n==1){
            return true;
        }
        else if(n <=0 || n%2!=0){
            return false;
        }

        return isPowerOfTwo(n/2);
    }
}


// Alternative Solution for the same problem is
class Solution {
    public boolean isPowerOfTwo(int n) {
         if(n<=0){
            return false;
        }
        return (n & (n-1))==0;
}
}
