        mat[i][j]=mat[k-j][i];
        mat[k-j][i]=mat[k-i][k-j];
        mat[k-i][k-j]=mat[j][k-i];
        mat[j][k-i]=t;
      }  
    }
}