class alpha {
    public static void main(String[] args) {
        char[] alpha = new char[26];
        for(int i = 0; i < 26; i++) {
            alpha[i] = (char) (i + 'a');
        }
        
        for(int i = 0; i < 26; i++) {
            System.out.println(alpha[i]);
        }
    }
}
