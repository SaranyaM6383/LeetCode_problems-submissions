                                      map.put(nums[l], map.get(nums[l]) - 
                                      1);                 l
                                      ++;             }            
                          ans = Math.max(ans, r - l + 1);         }     
                               return ans;     } }
                        while (map.get(nums[r]) > k) {       