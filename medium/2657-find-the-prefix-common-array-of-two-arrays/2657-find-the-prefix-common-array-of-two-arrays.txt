            else seen[A[i]-1]=true;
            if(seen[B[i]-1]) count++;
            else seen[B[i]-1]=true;
            res[i]=count;
        }    
        return res;
    }
}