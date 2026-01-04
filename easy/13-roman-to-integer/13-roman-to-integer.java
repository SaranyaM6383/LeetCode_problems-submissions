            } else {
                res += roman.get(s.charAt(i));
            }
        }
        return res + roman.get(s.charAt(s.length() - 1));        
    }
}