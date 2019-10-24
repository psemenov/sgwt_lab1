public class BTree  {
    private static final int M = 4;

    private Node root;       // root of the B-tree
    public int height;      // height of the B-tree
    private int n;           // number of key-value pairs in the B-tree
    StringBuilder log = new StringBuilder();

    private static final class Node {
        private int m;                             // number of 3
        private Key[] keys = new Key[M];   // the array of children

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
        return height + 1;
    }

    public Integer get(int key) {
        return search(root, key, height);
    }

    public Integer search(Node x, int key, int ht) {
        Key[] keys = x.keys;

        if (ht == 0) {
            for (int j = 0; j < x.m; j++) {
                if (key == keys[j].key) return keys[j].key;
            }
        }
        else {
            for (int j = 0; j < x.m; j++) {
                if (j+1 == x.m || key < keys[j+1].key)
                    return search(keys[j].next, key, ht-1);
            }
        }
        return null;
    }

    public void put(int key) {
        if(log.length() > 0) log.delete(0, log.length() - 1);
        log.append("Inserting value: " + key + "\n");
        Node u = insert(root, key, height);
        n++;
        if (u == null) return;

        // need to split root
        Node t = new Node(2);
        t.keys[0] = new Key(root.keys[0].key, root);
        t.keys[1] = new Key(u.keys[0].key, u);
        root = t;
        height++;
    }

    public Node insert(Node h, int key, int ht) {
        int j;
        Key t = new Key(key, null);
        log.append("Current node: h" + ht + " "+  key + "\n");

        if (ht == 0) {
            for (j = 0; j < h.m; j++) {
                if (key < h.keys[j].key) break;
            }
        }
        else {
            for (j = 0; j < h.m; j++) {
                if ((j+1 == h.m) || key < h.keys[j+1].key) {
                    Node u = insert(h.keys[j++].next, key, ht-1);
                    if (u == null) return null;
                    t.key = u.keys[0].key;
                    t.next = u;
                    break;
                }
            }
        }

        for (int i = h.m; i > j; i--)
            h.keys[i] = h.keys[i-1];
        h.keys[j] = t;
        h.m++;
        if (h.m < M) return null;
        else         return split(h);
    }

    public Node split(Node h) {
        log.append("Splitting node\n");
        Node t = new Node(M/2);
        h.m = M/2;
        for (int j = 0; j < M/2; j++)
            t.keys[j] = h.keys[M/2+j]; 
        return t;    
    }

    public String outputLog() {
        return toString(root, 0);
    }

    private String toString(Node h, int ht) {
        StringBuilder s = new StringBuilder();
        Key[] keys = h.keys;

        if (ht == height) {
            for (int j = 0; j < h.m; j++) {
                s.append("[h"+ht + " " + keys[j].key + "]");
            }
        }
        else {
            for (int j = 0; j < h.m; j++) {
                s.append("(h"+ht + " " + keys[j].key + ")");
                s.append(toString(keys[j].next, ht+1));
            }
        }
        return s.toString();
    }


    public static void main(String[] args) {
        BTree st = new BTree();

        st.put(1);
        System.out.println(st.outputLog());
        st.put(2);
        System.out.println(st.outputLog());
        st.put(3);
        System.out.println(st.outputLog());
        st.put(4);
        System.out.println(st.outputLog());
        st.put(5);
        System.out.println(st.outputLog());
        st.put(5);
        System.out.println(st.outputLog());
        st.put(4);
        System.out.println(st.outputLog());
        st.put(1);
        System.out.println(st.outputLog());

        System.out.println(st.get(5));
        System.out.println(st.get(6));

        System.out.println("size:    " + st.size());
        System.out.println("height:  " + st.height());
        System.out.println(st);
        System.out.println(st.outputLog());
    }

}