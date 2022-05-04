package Pyramids;

public class Pyramid {
    public static void main(String args[]) {
        //R for rows and C for columns
        //row denotes the number of rows you want to print
        int R, C, row = 12;
        //Outer loop work for rows
        for (R=0; R<row; R++){
            for (C=row-R; C>1; C--)
            {
            //prints space between two stars
                System.out.print(" ");
            }
            //inner loop for columns
            for (C=0; C<=R; C++ )
            {
            //prints star
                System.out.print("* ");
            }
            //throws the cursor in a new line after printing each line
            System.out.println();

        }}}












