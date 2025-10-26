            index--;
        }
        if (amount != 0) {
            return new int[]{-1};
        } else {
            for (int i = 0; i < 5; i++) {
                stores[i] -= ans[i];
            }
            return Arrays.stream(ans).mapToInt(i -> (int) i).toArray();
        }
    }
}