        }
        
        Collections.sort(fruits_to_swap);
        long totalCost = 0;
        int swapsToMake = fruits_to_swap.size() / 2;
        for (int i = 0; i < swapsToMake; i++) {
            totalCost += Math.min(fruits_to_swap.get(i), 2 * minVal);
        }
        
        return totalCost;
    }
}