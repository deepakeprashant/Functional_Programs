import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FunctionalProgram {
    static Scanner scan = new Scanner(System.in);
    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
    PrintWriter printWriter = new PrintWriter(outputStreamWriter);

    public static void main(String[] args) {
        FunctionalProgram functionalProgram = new FunctionalProgram();
        while (true) {
            System.out.println("1] 2D ARRAY USE PrintWriter");
            System.out.println("2] SUM OF 3 INT ADD TO ZERO");
            System.out.println("3] EUCLIDEAN DISTANCE PROGRAM");
            System.out.println("4] EXIT PROGRAM");
            System.out.println("ENTER YOUR CHOICE");
            switch (scan.nextInt()) {
                case 1:
                    functionalProgram.twoDArrayPrint();
                    break;
                case 2:
                    functionalProgram.sumOfThreeAddToZero();
                    break;
                case 3:
                    int x_Point = Integer.parseInt(args[0]);
                    int y_Point = Integer.parseInt(args[1]);
                    double distance;
                    distance = Math.sqrt(Math.pow(x_Point, 2) + Math.pow(y_Point, 2));
                    System.out.println("Euclidean distance from (x,y) to the Origin (0,0) is: "
                            + Math.floor(distance));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("WRONG CHOICE");
            }
        }
    }

    private void sumOfThreeAddToZero() {
        System.out.println("WELCOME SUM OF THREE ADD TO ZERO");
        System.out.println("ENTER ARRAY SIZE");
        int size = scan.nextInt();
        int[] array = new int[size];
        int countTriplets = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("ENTER ARRAY VALUES IN " + i + " LOCATION");
            array[i] = scan.nextInt();
        }
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                for (int k=0;k<size;k++){
                    int sum = array[i]+array[j]+array[k];
                    if(sum==0){
                        ++countTriplets;
                        System.out.println(array[i]+" "+array[j]+" "+array[k]);
                    }
                }
            }
        }
        if (countTriplets==0){
            System.out.println(" \n No distinct triplets found in the array");
        }else {
            System.out.println(" Total number of Distinct triplets in the array : " + countTriplets);
        }
    }

    private void twoDArrayPrint() {
        System.out.println("WELCOME 2D ARRAY PROGRAM");
        System.out.println("ENTER THE ROW SIZE");
        int row = scan.nextInt();
        System.out.println("ENTER THE COLUMN SIZE");
        int column = scan.nextInt();
        int[][] array = new int[row][column];
        for (int indexOfRow = 0; indexOfRow < row; indexOfRow++) {
            for (int indexOfColumn = 0; indexOfColumn < column; indexOfColumn++) {
                System.out.println("Enter The value of [" + indexOfRow + " , " + indexOfColumn + "] Location");
                array[indexOfRow][indexOfColumn] = scan.nextInt();
            }
        }
        System.out.println("Printing Your Integer array of size " + row + "*" + column);
        for (int indexOfRow = 0; indexOfRow < row; indexOfRow++) {
            for (int indeOfColumn = 0; indeOfColumn < column; indeOfColumn++) {
                printWriter.print(array[indexOfRow][indeOfColumn] + "\t");
            }
            printWriter.println();
        }
        printWriter.flush();
    }
}
