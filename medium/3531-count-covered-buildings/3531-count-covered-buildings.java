            TreeSet<Integer> rows = colToRow.get(y);
            
            Integer left = cols.lower(y);
            Integer right = cols.higher(y);
            Integer up = rows.lower(x);
            Integer down = rows.higher(x);
            
            if ((left != null) && (right != null) && (up != null) && (down != null)) {
                cnt++;
            }
        }
        return cnt;
    }
}