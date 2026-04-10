                minDistance=Math.min(minDistance,distance);
            }
        }
        return minDistance == Integer.MAX_VALUE?-1:minDistance;
    }
}