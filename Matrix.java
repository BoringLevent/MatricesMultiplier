public class Matrix {
    public int n_rows;
    public int n_columns;

    public int[][] values;

    public Matrix(int[][] data){
        n_rows = data.length;
        n_columns = data[0].length;

        values = new int [n_rows][n_columns];

        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[0].length;j++){
                values[i][j] = data[i][j];
            }
        }
    }

    public String toString(){
        for(int i = 0; i < n_rows; i++){
            for(int j = 0; j < n_columns; j++){
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
        return "";
    }

}
