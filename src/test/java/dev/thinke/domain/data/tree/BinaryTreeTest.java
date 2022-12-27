package dev.thinke.domain.data.tree;

import dev.thinke.domain.data.type.DictionaryItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    private DictionaryItem<Integer, String> treeOne() {
        return new DictionaryItem<>(1, "one");
    }

    private DictionaryItem<Integer, String> treeTwo() {
        return new DictionaryItem<>(2, "two");
    }

    private DictionaryItem<Integer, String> treeThree() {
        return new DictionaryItem<>(3, "three");
    }

    private DictionaryItem<Integer, String> treeFour() {
        return new DictionaryItem<>(4, "four");
    }

    private DictionaryItem<Integer, String> treeFive() {
        return new DictionaryItem<>(5, "five");
    }

    private DictionaryItem<Integer, String> treeSix() {
        return new DictionaryItem<>(6, "six");
    }

    private BinaryTree<Integer, String> buildTreeWithInsertion() {
        var root = new BinaryTree<>(new DictionaryItem<>(4, "four"));
        root.insert(2, "two");
        root.insert(1, "one");
        root.insert(3, "three");
        root.insert(6, "six");
        root.insert(5, "five");
        return root;
    }

    private Tree<Integer, String> buildTreeManually() {
        var root = new Tree<Integer, String>();
        root.data = new DictionaryItem<>(4, "four");
        var leftOne = new Tree<Integer, String>();
        leftOne.data = new DictionaryItem<>(2, "two");
        root.left = leftOne;
        var leftTwo = new Tree<Integer, String>();
        leftTwo.data = new DictionaryItem<>(1, "one");
        leftOne.left = leftTwo;
        var rightOne = new Tree<Integer, String>();
        rightOne.data = new DictionaryItem<>(3, "three");
        leftOne.right = rightOne;
        var rightTwo = new Tree<Integer, String>();
        rightTwo.data = new DictionaryItem<>(6, "six");
        root.right = rightTwo;
        var leftThree = new Tree<Integer, String>();
        leftThree.data = new DictionaryItem<>(5, "five");
        rightTwo.left = leftThree;
        return root;
    }

    public void testInsertion() {
        var manualRoot = buildTreeManually();
        var insertionRoot = buildTreeWithInsertion().root();
        assertEquals(manualRoot.data, insertionRoot.data);
        assertEquals(manualRoot.left.data, insertionRoot.left.data);
        assertEquals(manualRoot.left.left.data, insertionRoot.left.left.data);
        assertEquals(manualRoot.left.right.data, insertionRoot.left.right.data);
        assertEquals(manualRoot.right.data, insertionRoot.right.data);
        assertEquals(manualRoot.right.left.data, insertionRoot.right.left.data);
    }

    public void testMinMaxDeletion() {
        var root = buildTreeWithInsertion();
        assertEquals("one", root.min());
        assertEquals("six", root.max());
        root.delete(6);
        assertEquals("five", root.max());
        root.delete(1);
        assertEquals("two", root.min());
    }

    public void testRandomDeletion() {
        var root = buildTreeWithInsertion();
        assertEquals("five", root.search(5));
        root.delete(5);
        assertNull(root.search(5));
        assertEquals("six", root.max());
        assertEquals("three", root.search(3));
        root.delete(3);
        assertNull(root.search(3));
        assertEquals("one", root.min());
    }
}
