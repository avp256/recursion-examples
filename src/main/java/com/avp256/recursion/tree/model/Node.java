package com.avp256.recursion.tree.model;

import lombok.Builder;
import lombok.Getter;









@Getter
@Builder
public class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;
}
