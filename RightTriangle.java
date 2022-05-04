package Pyramids;

public class RightTriangle {
    public static void main(String... args)
    {
        // R for row C for columns
        //row denotes the number of the rows you want to print
        int R,C, row=6;
        // out loop for rows
        for (R=0; R<row;R++)
        {
        // inner loop for columns
        for(C=0;C<=R;C++)

        {
            //print stars
            System.out.print("* ");
        }
        //
            System.out.println();
        }
    }
}
