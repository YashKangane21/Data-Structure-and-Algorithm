package Trie.Insertion;

public class code {
    static class Node{
        Node[] children;
        boolean eow;

        Node(){
            children = new Node[26];
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    public static Node root = new Node();
    
    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static void main(String[] args) {
        insert("the");
        insert("there");
        insert("their");
        insert("a");
        insert("also");
        boolean searched = search("their");
        if(searched == false){
            System.out.println("word not found");
        }else{
            System.out.println("Word found");
        }

    }
}
