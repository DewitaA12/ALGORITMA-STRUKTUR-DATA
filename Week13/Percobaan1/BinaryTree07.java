package Week13.Percobaan1;

public class BinaryTree07 {
    Node07 root;

    public BinaryTree07() {
        root = null;
    }

    boolean isEmpty() {
        return root == null; // Harus mengembalikan true jika root null
    }

    void add(int data) {
        if (isEmpty()) { // Tree is empty
            root = new Node07(data);
        } else {
            Node07 current = root;
            Node07 parent;
            while (true) {
                parent = current;
                if (data < current.data) { // Masuk ke sub-pohon kiri
                    current = current.left;
                    if (current == null) {
                        parent.left = new Node07(data);
                        return;
                    }
                } else if (data > current.data) { // Masuk ke sub-pohon kanan
                    current = current.right;
                    if (current == null) {
                        parent.right = new Node07(data);
                        return;
                    }
                } else {
                    // Data sudah ada
                    return;
                }
            }
        }
    }

    boolean find(int data) {
        Node07 current = root;
        while (current != null) {
            if (current.data == data) {
                return true; // Data ditemukan
            } else if (data < current.data) {
                current = current.left; // Ke kiri
            } else {
                current = current.right; // Ke kanan
            }
        }
        return false; // Data tidak ditemukan
    }

    void traversePreOrder(Node07 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node07 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node07 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node07 getSuccessor(Node07 del) {
        Node07 successor = del.right;
        Node07 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }

        Node07 parent = root;
        Node07 current = root;
        boolean isLeftChild = false;

        while (current != null && current.data != data) {
            parent = current;
            if (data < current.data) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Ga nemu datane!");
            return;
        }

        // Node to be deleted has no children (leaf node)
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        // Node to be deleted has only one child (right child)
        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }
        // Node to be deleted has only one child (left child)
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        }
        // Node to be deleted has two children
        else {
            Node07 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }
}
