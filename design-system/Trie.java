/**

Accepted
16 / 16 testcases passed
Xavier Chopin
Xavier Chopin
submitted at Aug 07, 2025 15:41

Editorial

Solution
Runtime
34
ms
Beats
72.51%
Analyze Complexity
Memory
55.22
MB
Beats
85.08%
*/


class Trie {

    private Trie[] children;
    private boolean terminate;

    public Trie() {
         this.children = new Trie[26];
    }

    public void insert(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';

            if (node.children[index] == null) {
                node.children[index] = new Trie();
            }

            node = node.children[index];
        }

        node.terminate = true;
  
    }

    public boolean search(String word) {
        Trie node = this;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';

            if (node.children[index] == null) {
                return false;
            }

            node = node.children[index];
        }

        return node.terminate == true;
    }

    public boolean startsWith(String prefix) {
        Trie node = this;
        prefix = prefix.toLowerCase();
        
        for (int i = 0; i < prefix.length(); i++){
            int index = prefix.charAt(i) - 'a';

            if (node.children[index] == null) {
                return false;
            }

            node = node.children[index];
        }

        return true;

    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
