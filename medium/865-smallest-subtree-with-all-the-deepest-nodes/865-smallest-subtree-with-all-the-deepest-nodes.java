            return new Result(right.node, right.dist + 1);
        } 
        else {
            // Depths are equal; current node is the LCA
            return new Result(node, left.dist + 1);
        }
    }
}