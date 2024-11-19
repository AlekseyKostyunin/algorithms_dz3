package org.example;

public class Node {

    int value;
    Node left, right, parent;
    boolean isRed;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.parent = null;
        this.isRed = true; // Новый узел всегда красный
    }
}