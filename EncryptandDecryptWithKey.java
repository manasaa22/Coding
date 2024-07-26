import java.util.Scanner;
public class EncryptandDecryptWithKey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key for encryption and decryption:");
        int key=2;
        String s=sc.nextLine();
        System.out.println("Original String"+" "+s);
        String s1=encrypt(s,key);
        System.out.println("Encrypted String"+" "+s1);
        System.out.println("Decrypted String"+" "+decrypt(s1,key));
    }
    public static String encrypt(String s,int k){
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            char ch=(char)(c-k);
            
                sb.append(ch);
        }
        return  sb.toString();
    }
    public static String decrypt(String s,int k){
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            char ch=(char)(c+k);
            
                sb.append(ch);
        }
        return  sb.toString();
    }
}
