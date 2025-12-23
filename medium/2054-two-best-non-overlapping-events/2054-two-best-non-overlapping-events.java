            while (j < n && endSorted[j][1] < start) {
                j++;
            }
            ans = Math.max(ans, value);
            if (j > 0) {
                ans = Math.max(ans, value + maxValueTill[j - 1]);
            }
        }
        return ans;
    }
}