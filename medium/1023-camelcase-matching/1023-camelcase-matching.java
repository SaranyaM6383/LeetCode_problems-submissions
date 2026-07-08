        return ans;
    }
    private boolean match(String query,String pattern){
        int j=0;
        for(int i=0;i<query.length();i++){
            char ch=query.charAt(i);
            if(j<pattern.length() && ch==pattern.charAt(j)){
                j++;
                            }
                        else if(ch>='A' && ch<'Z'){
                            return false;
                        }
        }
        return j==pattern.length();
    }
}
        }
            ans.add(match(query,pattern));