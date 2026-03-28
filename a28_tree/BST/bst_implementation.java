package a28_tree.BST;

public class bst_implementation {
    static class node{
        int data;
        node left, right;

        node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static node insert(node root, int data){
        if(root == null){
            root = new node(data);
            return root;
        }
        if(data < root.data){
            root.left = insert(root.left, data);
        }else{
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void inorder(node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static int search(node root, int key){
        if(root == null){
            return -1;
        }
        if(root.data == key){
            return root.data;
        }
        else if(key < root.data){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {

        int values[] = {5,1,3,4,2,7,6};
        node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        System.out.print("Inorder : ");
        inorder(root);
        System.out.println();
        System.out.print("Preorder : ");
        preorder(root);
        System.out.println();
        System.out.print("Postorder : ");
        postorder(root);
        System.out.println();

        int key = 6;
        int searched = search(root, key);
        if(searched == -1){
            System.out.println("NOT found");
        }else{
            System.out.println("Found");
        }
    }
}
