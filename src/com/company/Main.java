package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String moves = "LDRRLRUULR";
        int uc=0;
        int dc=0;
        int lc=0;
        int rc=0;
        char [] mchar=moves.toCharArray();
        for (int i = 0; i <moves.length() ; i++) {
            if (mchar[i] == 'U') {
                uc++;
            } else if (mchar[i] == 'D') {
                dc++;
            }else if (mchar[i] == 'L') {
                lc++;
            }else {
                rc++;
            }

        }
        boolean result=false;
        if (uc == dc && lc == rc) {
            result=true;
        }
        System.out.println(result);

    }
}
