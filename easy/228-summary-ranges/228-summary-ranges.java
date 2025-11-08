            j++;
        }
        if(nums[j]==start) {
            result.add(String.valueOf(start));
        } else {
            result.add(start+"->"+nums[j]);
        }
        i=j+1;
    }
    return result;
    }
}       