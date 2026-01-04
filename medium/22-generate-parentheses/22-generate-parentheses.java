            dfs(openP + 1, closeP, s + "(", n, res);
        }
        if (closeP < openP) {
            dfs(openP, closeP + 1, s + ")", n, res);
        }
    }    
}