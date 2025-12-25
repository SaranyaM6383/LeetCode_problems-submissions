            if (cnt < 2) continue;
            
            long seg = (long) cnt * (cnt - 1) / 2; 
            totalSeg = (totalSeg + seg) % MOD;
            totalSq = (totalSq + seg % MOD * (seg % MOD)) % MOD;
        }
        long totalSegMod = totalSeg % MOD;
        long ans = (totalSegMod * totalSegMod % MOD - totalSq + MOD) % MOD;
        ans = ans * INV2 % MOD;
        return (int) ans;
    }
}