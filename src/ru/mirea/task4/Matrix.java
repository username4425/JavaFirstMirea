package ru.mirea.task4;

public class Matrix {
    private double[][] matrix;
    private int rows,cols;

    public Matrix(double[][] matrix, int rows, int cols) {
        this.matrix = matrix;
        this.rows = rows;
        this.cols = cols;
    }

    public void sum(Matrix other){
        if(other.cols!=cols || other.rows!=rows){
            System.out.print("Размеры матриц должны быть одинаковы.");
            return;
        }
        for(int i=0;i<rows;i++)
            for(int k=0;k<cols;k++)
                matrix[i][k]+= other.matrix[i][k];
    }

    public void mul(double num){
        for(int i=0;i<rows;i++)
            for(int k=0;k<cols;k++)
                matrix[i][k]*=num;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < cols; k++)
                System.out.print(matrix[i][k] + " ");
            System.out.print("\n");
        }
    }
}
