public class Main {

    public static int[][] multiplyMatrices(int[][] A, int[][] B, int shape){
        int[][] C = new int[shape][shape];
        for(int i = 0; i < shape; i++){
            for(int j = 0; j < shape; j++){
                C[i][j] = 0;
                for(int k = 0; k < shape; k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        return C;
    }
    public static void main(String[] args){
        int[][] A = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] B = {{4,5,6}, {7,8,9}, {10,11,12}};
        multiplyMatrices(A, B, 3);

        Matrix mtA = new Matrix(A);
        Matrix mtB = new Matrix(B);
        System.out.println(mtA);
        System.out.println(mtB);

    }
    
}
