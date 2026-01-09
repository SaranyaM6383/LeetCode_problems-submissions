                int key = i - j;
                matrix[i][j] = diagonalMap.get(key).poll();
            }
        }
        return matrix;
    }
}