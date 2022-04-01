package SiniflarMetotlar;
//sondan ve baştan yaklaşıcaz
public class Palindromikelimeler {

    static boolean isPalindrome(String str){

         int i = 0;
         int j = str.length() - 1;
         while (i < j){

             if (str.charAt(i) == str.charAt(j)){
                 return true;
             }

             i++;
             j--; // bu ikisiyle baştan ve sondan harfleri gezmiş oluyoruz
         }
         return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("anna"));
    }
}
