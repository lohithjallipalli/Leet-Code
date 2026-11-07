class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) return 0;
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int level = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                String word = q.poll();
                if (word.equals(endWord)) return level;
                for (int i = 0; i < word.length(); i++) {
                    for (int c = 0; c < 26; c++) {
                        char ch = (char)('a' + c);
                        String newWord = word.substring(0, i) + ch + word.substring(i + 1);
                        if (set.contains(newWord)) {
                            set.remove(newWord);
                            q.offer(newWord);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }
}