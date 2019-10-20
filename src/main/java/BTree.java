public class BTree  {
    private static final int M = 4;

    private Node root;       // root of the B-tree
    private int height;      // height of the B-tree
    private int n;           // number of key-value pairs in the B-tree

    private static final class Node {
        private int m;                             // number of children
        private Key[] children = new Key[M];   // the array of children

        // create a node with k children
        private Node(int k) {
            m = k;
        }
    }

    private static class Key {
        private int key;
        private Node next;    
        public Key(int key, Node next) {
            this.key  = key;
            this.next = next;
        }
    }

    public BTree() {
        root = new Node(0);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return n;
    }

    public int height() {
        return height;
    }

    public int get(int key) {
        return search(root, key, height);
    }

    public Integer search(Node x, int key, int ht) {
        Key[] children = x.children;

        if (ht == 0) {
            for (int j = 0; j < x.m; j++) {
                if (key == children[j].key) return children[j].key;
            }
        }
        else {
            for (int j = 0; j < x.m; j++) {
                if (j+1 == x.m || key < children[j+1].key)
                    return search(children[j].next, key, ht-1);
            }
        }
        return null;
    }

    public void put(int key) {
        Node u = insert(root, key, height);
        n++;
        if (u == null) return;

        // need to split root
        Node t = new Node(2);
        t.children[0] = new Key(root.children[0].key, root);
        t.children[1] = new Key(u.children[0].key, u);
        root = t;
        height++;
    }

    public Node insert(Node h, int key, int ht) {
        int j;
        Key t = new Key(key, null);

        if (ht == 0) {
            for (j = 0; j < h.m; j++) {
                if (key < h.children[j].key) break;
            }
        }
        else {
            for (j = 0; j < h.m; j++) {
                if ((j+1 == h.m) || key < h.children[j+1].key) {
                    Node u = insert(h.children[j++].next, key, ht-1);
                    if (u == null) return null;
                    t.key = u.children[0].key;
                    t.next = u;
                    break;
                }
            }
        }

        for (int i = h.m; i > j; i--)
            h.children[i] = h.children[i-1];
        h.children[j] = t;
        h.m++;
        if (h.m < M) return null;
        else         return split(h);
    }

    public Node split(Node h) {
        Node t = new Node(M/2);
        h.m = M/2;
        for (int j = 0; j < M/2; j++)
            t.children[j] = h.children[M/2+j]; 
        return t;    
    }

    public String toString() {
        return toString(root, height, "") + "\n";
    }

    private String toString(Node h, int ht, String indent) {
        StringBuilder s = new StringBuilder();
        Key[] children = h.children;

        if (ht == 0) {
            for (int j = 0; j < h.m; j++) {
                s.append(indent + children[j].key + " " + children[j].key + "\n");
            }
        }
        else {
            for (int j = 0; j < h.m; j++) {
                s.append(indent + "(" + children[j].key + ")\n");
                s.append(toString(children[j].next, ht-1, indent + "     "));
            }
        }
        return s.toString();
    }

    
    public static void main(String[] args) {
        BTree st = new BTree();

        st.put(1);
        st.put(2);
        st.put(3);
        st.put(4);
        st.put(5);
        st.put(1);
        st.put(5);

        st.put(1);
        st.put(2);
        st.put(3);
        st.put(4);
        st.put(5);
        st.put(1);
        st.put(5);


        System.out.println("size:    " + st.size());
        System.out.println("height:  " + st.height());
        System.out.println(st);
        System.out.println();
    }

}