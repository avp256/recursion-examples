package com.avp256.recursion.tree;

import com.avp256.recursion.tree.model.Node;











public class RecursiveTreePrinter<T> implements TreePrinter<T> {
    public void print(Node<T> node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");
        print(node.getLeft());
        print(node.getRight());
    }
}
