        if (nextIndex < 0) {
            nextIndex += arr.length;
        }
        if (nextIndex == curr) {
            return -1;
        }
        return nextIndex;
    }
}
        }
        int nextIndex = (arr[curr] + curr) % arr.length;