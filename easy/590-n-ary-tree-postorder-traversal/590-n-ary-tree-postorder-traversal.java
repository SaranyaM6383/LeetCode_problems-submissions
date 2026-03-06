    public void dfs(Node root,List<Integer> res){
        for(Node child:root.children){
            dfs(child,res);
        }
        res.add(root.val);
    }
}