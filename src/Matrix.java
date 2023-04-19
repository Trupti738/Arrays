

public class Matrix {

public static void main(String args[]){
//creating a matrix
    int original[][]={{1,3,},{2,4,},};

    System.out.println("Printing Matrix without transpose:");
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print(original[i][j]+" ");
        }
        System.out.println();//new line
    }
    System.out.println("Printing Matrix After Transpose:");
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print(original[j][i]+" ");
        }

        System.out.println();
    }    }}