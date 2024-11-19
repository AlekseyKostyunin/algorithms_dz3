package org.example;

public class Main {

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.add(10);
        tree.add(20);
        tree.add(30);
        tree.add(15);
        tree.add(25);
        tree.add(5);
        System.out.println("Red-Black Tree:");
        tree.printTree();
    }
}