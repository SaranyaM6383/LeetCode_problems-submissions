                    if(a != 0) {
                        ans.append(s.charAt(i));
                    }
                }
                else break;
                i += gap;
                if(i < n && gap != 0) ans.append(s.charAt(i));
            }
            a -= 2;
            gap += 2;
        }
        return ans.toString();
    }
}