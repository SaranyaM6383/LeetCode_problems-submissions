class Solution {
    public int getLucky(String s, int k) {
        StringBuilder number=new StringBuilder();
        for(char X:s.toCharArray()){
            number.append(X-'a'+1);
        }
        while(k>0){
            int temp=0;
            for(char X:number.toString().toCharArray()){
                temp+=X-'0';
            }
            number=new StringBuilder(String.valueOf(temp));
            k--;
        }
        return Integer.parseInt(number.toString());
    }
}
        
       1945_Sum_of_Digits_of_String_After_Convert.java
