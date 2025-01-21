package PracticeDSA;

public class Palimdrome {

    public static void main(String[] args) {
        String palim2 = "NAMAN";
        String palim1 = "Amore' Roma";
        //Addition for filtering all string and should allow only number and alphabets;
        String finalPalimAfterFilter = palim1.replaceAll("[^a-zA-Z0-9_-]","");
        char[] charArr1 = finalPalimAfterFilter.toLowerCase().toCharArray();
        int len = charArr1.length;
        for(int i=0; i<(len-1)/2;i++){
            if(charArr1[i]!=charArr1[len-1-i]){
                System.out.printf("Not a Palimdrone");
                return;
            }
        }
        System.out.println("It is a palimdrone");
    }
 }
