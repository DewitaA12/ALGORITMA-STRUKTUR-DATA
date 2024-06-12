package Week13.Tugas;

public class BinaryTree {
        Node root;
         int[] data;
         int idxLast;
         int size;
    
        private Node addRecursive(Node current, int data) {
            if (current == null) {
                return new Node(data);
            }
    
            if (data < current.data) {
                current.left = addRecursive(current.left, data);
            } else if (data > current.data) {
                current.right = addRecursive(current.right, data);
            }
    
            return current;
        }
    
        public void add(int data) {
            root = addRecursive(root, data);
        }
    
        public int findMinValue() {
            return findMinValue(root);
        }
    
        private int findMinValue(Node node) {
            if (node.left == null) {
                return node.data;
            }
            return findMinValue(node.left);
        }
    
        public int findMaxValue() {
            return findMaxValue(root);
        }
    
        private int findMaxValue(Node node) {
            if (node.right == null) {
                return node.data;
            }
            return findMaxValue(node.right);
        }
    
        public void displayLeafNodes() {
            displayLeafNodes(root);
        }
    
        private void displayLeafNodes(Node node) {
            if (node == null) {
                return;
            }
    
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
    
            displayLeafNodes(node.left);
            displayLeafNodes(node.right);
        }
    
        public int countLeafNodes() {
            return countLeafNodes(root);
        }
    
        private int countLeafNodes(Node node) {
            if (node == null) {
                return 0;
            }
            if (node.left == null && node.right == null) {
                return 1;
            }
            return countLeafNodes(node.left) + countLeafNodes(node.right);
        }

            // Traverses the tree in PreOrder (Root, Left, Right)
            public void traversePreOrder() {
                traversePreOrder(root);
            }

            private void traversePreOrder(Node node) {
                if (node != null) {
                    System.out.print(node.data + " ");
                    traversePreOrder(node.left);
                    traversePreOrder(node.right);
                }
            }

            // Traverses the tree in PostOrder (Left, Right, Root)
            public void traversePostOrder() {
                traversePostOrder(root);
            }

            private void traversePostOrder(Node node) {
                if (node != null) {
                    traversePostOrder(node.left);
                    traversePostOrder(node.right);
                    System.out.print(node.data + " ");
                }
            

                }
    }

  