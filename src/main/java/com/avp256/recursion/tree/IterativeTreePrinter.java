package com.avp256.recursion.tree;

import com.avp256.recursion.tree.model.Node;

import java.util.Deque;
import java.util.LinkedList;








public class IterativeTreePrinter<T> implements TreePrinter<T> {
    public void print(Node<T> root) {
        Deque<Node<T>> deque = new LinkedList<>();
        deque.push(root);
        while (!deque.isEmpty()) {
            Node<T> node = deque.poll();
            System.out.print(node.getValue() + " ");
            if (node.getLeft() != null) {
                deque.push(node.getLeft());
            }
            if (node.getRight() != null) {
                deque.push(node.getRight());
            }
        }
    }
}
