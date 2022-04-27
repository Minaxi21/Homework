package Loops;

public class ForLoop {
    public static void main(String[] args){
        for (int i=2;i<21;i++){
            if (i%2==0) // code will divide "i" by two
                System.out.println(i + " Is Even"); //if there isn't any remainder after dividing it will print even
            else
                System.out.print(i + " Is Odd" + "\n"); //|"N" prints new line
        }
    }
}
