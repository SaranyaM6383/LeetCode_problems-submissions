                // Overlapping interval
                unionLength += (iv.end - currentEnd);
                currentEnd = iv.end;
            }
        }
        return unionLength;
    }
}