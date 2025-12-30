            grid[row + 1][col + 1] +
            grid[row + 2][col + 1];
        int col3 =
            grid[row][col + 2] +
            grid[row + 1][col + 2] +
            grid[row + 2][col + 2];
        if (!(col1 == diagonal1 && col2 == diagonal1 && col3 == diagonal2)) {
            return false;
        }
        return true;
    }
}