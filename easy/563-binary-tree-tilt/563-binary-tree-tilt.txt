        int leftSum=dfs(node.left);
        int rightSum=dfs(node.right);
        totalTilt+=Math.abs(leftSum-rightSum);
        return leftSum+rightSum+node.val;
    }
}