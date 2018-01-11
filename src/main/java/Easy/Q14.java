package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)  return "";
        if(strs.length == 1)  return strs[0];

        TrieTree trieTree = new TrieTree();
        String shortestStr = strs[0];

        for(String str : strs){
            trieTree.insert(str);
            shortestStr = str.length() < shortestStr.length() ? str : shortestStr;
        }

        return trieTree.getLongestPrefix(shortestStr);
    }

    private class TrieTree {
        private TrieNode root;

        public TrieTree(){
            root = new TrieNode();
        }

        //insert a string
        public void insert(String str){
            TrieNode head = root;
            for(char ch : str.toCharArray()){
                if( !head.containKey(ch) ){
                    head.put(ch, new TrieNode());
                }
                head.get(ch).addCount();
                head = head.get(ch);
            }
            head.setEnd();
        }

        //remove a string from tri-tree
        public void remove(String str){
            TrieNode head = root;
            for(char ch : str.toCharArray()){
                if( head.containKey(ch) ){
                    if( head.get(ch).getCount() > 1 ) {
                        head.removeCount();
                    }else{
                        head.get(ch).remove(ch);
                    }
                }
            }
        }

        //search a prefix return the last node in the trie tree, return null if no prefix exists
        public TrieNode searchPrefix(String str){
            TrieNode head = root;
            for(char ch : str.toCharArray()){
                if( head.containKey(ch) ){
                    head = head.get(ch);
                }else{
                    return null;
                }
            }
            return head;
        }

        //Return if the given string in the trie-tree
        public boolean search(String str){
            TrieNode node = searchPrefix(str);
            return node != null && node.isEnd();
        }

        //Return if there is any string in the trie tree that starts with the given string
        public boolean startWith(String str){
            TrieNode node = searchPrefix(str);
            return node != null;
        }

        public String getLongestPrefix(String str){
            StringBuilder sb = new StringBuilder();
            TrieNode head = root;
            for(char ch : str.toCharArray()){
                if( head.containKey(ch) && head.children.size() == 1 && !head.isEnd() ){
                    sb.append(ch);
                    head = head.children.get(ch);
                }else{
                    return sb.toString();
                }
            }
            return sb.toString();
        }
    }

    private class TrieNode {
        private HashMap<Character,TrieNode> children = null;
        private final int R = 26;
        private boolean isEnd;
        private int count = 0;  //How many strings visit this character

        public TrieNode(){
            children = new HashMap<Character,TrieNode>();
        }

        public boolean containKey(char ch){
            return children.containsKey(ch);
        }

        public TrieNode get(char ch){
            return children.get(ch);
        }

        public void put(char ch, TrieNode node){
            children.put(ch,node);
        }

        public void remove(char ch){
            children.remove(ch);
        }

        public void setEnd(){
            isEnd = true;
        }

        public boolean isEnd(){
            return isEnd;
        }

        public void addCount(){
            this.count++;
        }

        public void removeCount(){
            this.count--;
        }

        public int getCount(){
            return this.count;
        }
    }
}
