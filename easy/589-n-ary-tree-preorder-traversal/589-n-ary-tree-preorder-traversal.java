       List<Integer> result=new ArrayList<>();
    }
       traverse(root,result);
       return result; 
    private void traverse(Node node,List<Integer>result){
        if(node == null) return;
        result.add(node.val);
        for(Node child:node.children) traverse(child,result);
    }
}