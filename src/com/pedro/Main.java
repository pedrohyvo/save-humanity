package com.pedro;

import java.util.Scanner;

public class Main {

    private static final int MISMATCH_LIMIT = 1;
    private static final String NO_MATCH = "No Match!";
    private static final Scanner scanner = new Scanner(System.in);

    static boolean subMatches(String p, String v, int startingIndex) {
        int mismatchCount = 0;
        for (int i = 0; i < v.length(); i++) {
            boolean matches = p.charAt(startingIndex + i) == v.charAt(i);
            mismatchCount += matches ? 0 : 1;
            if (mismatchCount > MISMATCH_LIMIT) {
                //returns right away because more than 1 mismatch was found
                return false;
            }
        }
        return true;
    }

    static void virusIndices(String p, String v) {
        int matchCount = 0;
        int vlength = v.length();
        for (int i = 0; i <= p.length() - vlength; i++) {
            boolean matches = subMatches(p, v, i);
            matchCount += matches ? 1 : 0;
            if (matches) {
                //Format the output line
                String outputLine = (matchCount == 1 ? "" : " ") + i;
                System.out.print(outputLine);
            }
        }
        //print no match if there isn't at least one match
        System.out.println(matchCount == 0 ? NO_MATCH : "");
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] pv = scanner.nextLine().split(" ");

            String p = pv[0];

            String v = pv[1];

            virusIndices(p, v);
        }
    }
}
