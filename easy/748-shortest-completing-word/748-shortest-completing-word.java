                    valid = false;
                    break;
                }
            }
            if(valid && (shortest == null || word.length() < shortest.length())) 
            {
                shortest = word;
            }
        }
        return shortest;
    }
}