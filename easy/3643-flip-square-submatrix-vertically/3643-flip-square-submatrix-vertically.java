                int temp=grid[x+i][y+j];
                grid[x+i][y+j]=grid[x+k-1-i][y+j];
            }
        }
    }
                grid[x+k-1-i][y+j]=temp;
        return grid;
}