class Solution {
    public String finalString(String s){
        StringBuilder str=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='i')
            str.reverse();
            else
            str.append(ch);
        }
        return str.toString();
    }
}