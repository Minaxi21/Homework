package Pyramids;

public class LeftTriangle {

    public static void main(String args[]) {
        //R for rows and C for columns
        //row denotes the number of rows you want to print
       int R,C, row =6;
       // Outer loop works for row
        for (R=0; R<row; R++){

            //inner loop work for space
            for (C=2*(row-R); C>=0; C--)
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
            System.out.println();
            }
        }}







