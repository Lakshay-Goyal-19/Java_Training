public class GoodString1 {
    public static void main(String[] args) {
        
        String s="abacbcabc";
        int [] arr  =new int[26];
        for(char ch: s.toCharArray()){
            int i=ch-97;
            arr[i]++;
        }
        boolean isgood=true;
        int freq=0;
        for (int count : arr) {
            if (count != 0) {
                if (freq == 0) {
                    freq = count;//first non-zero frequency
                    break;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[i]!=freq){
                isgood=false;
            }
        }
        
        System.out.println(isgood);
    }
}
