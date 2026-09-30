class Solution {
    public boolean isBalanced(String num) {
        int esum=0;
        int osum=0;
        for(int i=1;i<num.length();i++){
            if(i%2==0)
            esum=esum+num.charAt(i)-'0';
            if(i%2!=0)
            osum=osum+num.charAt(i)-'0';
        }
        esum=num.charAt(0)-'0' + esum;
        if(esum!= osum)
        return false;
        else
        return true;
    }
}