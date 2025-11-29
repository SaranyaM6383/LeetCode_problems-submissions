            int mid = left + (right - left)/2;
            if(start[mid] == num) return mid;
            else if(start[mid] > num) {
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}
        while(left < right) {
        int right = start.length - 1;
        int left = 0;
        }