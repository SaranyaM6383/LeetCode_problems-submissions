            else if (c == 'R')
                LeftRight++;
            else if (c == 'L')
                LeftRight--;
        }
        return (LeftRight == 0 && UpDown == 0);
    }
}