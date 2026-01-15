        maxConsecutiveHBars = Math.max(maxConsecutiveHBars, tempH);
        maxConsecutiveVBars = Math.max(maxConsecutiveVBars, tempV);
        int squareLen = Math.min(maxConsecutiveHBars, maxConsecutiveVBars) + 1;
        return squareLen * squareLen;
    }
}