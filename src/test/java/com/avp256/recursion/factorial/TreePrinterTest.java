package com.avp256.recursion.factorial;

import com.avp256.recursion.tree.IterativeTreePrinter;
import com.avp256.recursion.tree.RecursiveTreePrinter;
import com.avp256.recursion.tree.TreePrinter;
import com.avp256.recursion.tree.model.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TreePrinterTest {
    private Node<Integer> root;

    @Test
    public void recursiveTreePrinterTest() {
        TreePrinter<Integer> treePrinter = new RecursiveTreePrinter<>();
        treePrinter.print(root);
    }

    @Test
    public void iterativeTreePrinterTest() {
        TreePrinter<Integer> treePrinter = new IterativeTreePrinter<>();
        treePrinter.print(root);
    }

    @BeforeEach
    public void init() {
        root = createTree(5);
    }

    @AfterEach
    public void sout() {
        System.out.println();
    }

    private Node<Integer> createTree(int levelCount) {
        if (levelCount <= 0) {
            return null;
        }
        return Node.<Integer>builder()
                .value((int) (Math.random() * 100))
                .left(createTree(levelCount - 1))
                .right(createTree(levelCount - 1))
                .build();
    }
}
