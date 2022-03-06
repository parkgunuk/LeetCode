class Solution {
    public String getHint(String secret, String guess) {
        int a = 0;
        int b = 0;
        boolean[] isA = new boolean[secret.length()];
        boolean[] isB = new boolean[guess.length()];
        
        for(int i = 0 ; i < secret.length() ; ++i){
            if(secret.charAt(i) == guess.charAt(i)){
                a++;
                isA[i] = true;
                isB[i] = true;
            }
        }
        
        System.out.println(Arrays.toString(isA));
        System.out.println(Arrays.toString(isB));
        
        for(int i = 0 ; i < guess.length() ; ++i){
            if(isB[i]) continue;
            for(int j = 0 ; j < secret.length() ; ++j){
                if(isA[j]) continue;
                if(guess.charAt(i) == secret.charAt(j)){
                    b++;
                    isA[j] = true;
                    isB[i] = true;
                    break;
                }
            }
        }
        
        return a+"A"+b+"B";
    }
}