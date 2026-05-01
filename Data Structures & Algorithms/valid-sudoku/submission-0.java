class Solution {
    public char[][] reverse(char[][] arr) {
        char[][] res = new char[arr.length][arr[0].length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = arr[j][i];
            }
        }
        return res;
    }

    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> map = new HashMap<>();
        char[][] reverse = reverse(board);
        System.out.println(reverse(board));
        for (int i = 0; i < 9; i++) {
            char[] row = board[i];
            char[] col = reverse[i];
            int height =i%3;
            if(height==0){
                map.put(0, new HashSet<>());
                map.put(1, new HashSet<>());
                map.put(2, new HashSet<>());
            };
            HashSet<Character> setrow = new HashSet<>();
            HashSet<Character> setcolone = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                int boxIndex = (int) j/3;
                char rItem = row[j];
                char cItem = col[j];
                if(cItem != '.'){
                    if(!setcolone.contains(cItem)){
                        setcolone.add(cItem);
                    }else return false;
                }
                if(rItem != '.'){
                    if(!setrow.contains(rItem)){
                        setrow.add(rItem);
                    }else return false;
                    if (!map.get(boxIndex).contains(rItem)) {
                        map.get(boxIndex).add(rItem);
                    }
                    else return false;
                }
            }
        }
        return true;
    }

}
