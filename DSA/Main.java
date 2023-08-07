public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("banana");
        trie.insert("orange");

        System.out.println(trie.search("apple"));   // Output: true
        System.out.println(trie.search("grape"));   // Output: false
        System.out.println(trie.startsWith("app")); // Output: true
        System.out.println(trie.startsWith("ban")); // Output: true
        System.out.println(trie.startsWith("gr"));  // Output: false
    }
}
