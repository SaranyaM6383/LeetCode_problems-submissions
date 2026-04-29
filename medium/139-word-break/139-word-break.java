                int start=i-w.length();
                if(start>=0 && dp[start] && s.substring(start,i).equals(w)){
                    dp[i]=true;
                }
                    break;
            }
        }
        return dp[s.length()];
    }
}