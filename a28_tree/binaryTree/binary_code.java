package a28_tree.binaryTree;
import java.util.*;
public class binary_code {
    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        //insertion
        static int idx = 0;
        public static node insert(int nodes[]){
            if(nodes[idx] == -1){
                idx++;
                return null;
            }
            node newnode = new node(nodes[idx++]);
            newnode.left = insert(nodes);
            newnode.right = insert(nodes);

            return newnode;
        }

        //preorder
        public static void preorder(node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        //inorder
        public static void inorder(node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        //postorder
        public static void postorder(node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // lever order teraversal
        public static void levelorder(node root){
            if(root == null){
                return;
            }
            Queue<node> q = new LinkedList<>();
            q.add(root);

            while(!q.isEmpty()){
                node curr = q.remove();
                System.out.print(curr.data +  " ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }

        //height in terms of node
        public static int height(node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(lh, rh) + 1;
        }

        //count of nodes
        public static int countNodes(node root){
            if(root == null){
                return 0;
            }
            int lc = countNodes(root.left);
            int rc = countNodes(root.right);

            return lc+rc+1;
        }

        //sum of nodes
        public static int sumofNodes(node root){
            if(root == null){
                return 0;
            }
            int ls = sumofNodes(root.left);
            int rs = sumofNodes(root.right);

            return ls + rs + root.data;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        node root = tree.insert(nodes);
        // System.out.println(root.data);
        System.out.print("Preorder :");
        tree.preorder(root);
        System.out.println();

        System.out.print("Inorder :");
        tree.inorder(root);
        System.out.println();

        System.out.print("Postorder :");
        tree.postorder(root);
        System.out.println();

        System.out.print("Level Order :");
        tree.levelorder(root);
        System.out.println();

        System.out.println("Height : " + tree.height(root));

        System.out.println("Count of nodes : " + tree.countNodes(root));
        System.out.println("Sum of nodes : " + tree.sumofNodes(root));
    }
}
