import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FunctionalProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        OutputStreamWriter outputStreamWriter =  new OutputStreamWriter(System.out);
        PrintWriter printWriter = new PrintWriter(outputStreamWriter);
        System.out.println("WELCOME 2D ARRAY PROGRAM");
        System.out.println("ENTER THE ROW SIZE");
        int row = scan.nextInt();
        System.out.println("ENTER THE COLUMN SIZE");
        int column = scan.nextInt();
        int[][] array = new int[row][column];
        for (int indexOfRow = 0; indexOfRow < row; indexOfRow++) {
            for (int indexOfColumn = 0; indexOfColumn < column; indexOfColumn++){
                System.out.println("Enter The value of ["+indexOfRow+" , "+indexOfColumn+"] Location");
                array[indexOfRow][indexOfColumn] = scan.nextInt();
            }
        }
        System.out.println("Printing Your Integer array of size "+row+"*"+column);
        for (int indexOfRow =0;indexOfRow<row;indexOfRow++){
            for (int indeOfColumn =0 ; indeOfColumn<column;indeOfColumn++){
                printWriter.print(array[indexOfRow][indeOfColumn]+"\t");
            }
            printWriter.println();
        }
        printWriter.flush();
    }
}
