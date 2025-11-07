                int a = dominoes[i][0], b = dominoes[i][1];
                int c = dominoes[j][0], d = dominoes[j][1];
                if((a == c && b == d) || (a == d && b == c)){
                    count++;
                }
            }
        }
        return count;
    }
}