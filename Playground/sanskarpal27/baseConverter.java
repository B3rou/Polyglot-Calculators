//simple first contribution which converts a decimal number to its binary equivalent and vice-versa

import java.io.*;

public class baseConverter {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a decimal number: ");
        int dec = Integer.parseInt(br.readLine());
        System.out.println("Binary Equivalent: " + decToBin(dec));
        System.out.println("Enter a Binary number: ");
        String bin = br.readLine();
        System.out.println("Decimal Equivalent: " + binToDec(bin));
        br.close();
    }
    public static String decToBin(int n){
        StringBuilder bin = new StringBuilder();
        while(n > 0){
            bin.insert(0,n%2);
            n/=2;
        }
        return bin.toString();
    }
    public static int binToDec(String bin){
        int dec = 0;
        int power = 0, dig;
        for(int i=bin.length()-1;i>=0;i--){
            dig = bin.charAt(i) - '0';
            dec += dig * (int)Math.pow(2,power);
            power++;
        }
        return dec;
    }
}
