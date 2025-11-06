                lineCount++;
                currentLineWidth = charWidth;
            }else{
                currentLineWidth += charWidth;
            }
        }
        return new int[]{ lineCount,currentLineWidth};
    }
}
            if(currentLineWidth + charWidth > 100){
            int charWidth=widths[c-'a'];
        for(char c:s.toCharArray()){
        int currentLineWidth=0;
        int lineCount=1;