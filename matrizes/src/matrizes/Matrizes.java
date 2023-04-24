/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizes;

import java.util.Arrays;

/**
 *
 * @author vini
 */
public class Matrizes {
public static void main(String args[]) {
      // Somar matrizes
      int[][] matrix1 = {{8,10},{2,3},{9,8}};
      int[][] matrix2 = {{2,3,1},{1,2,3}};
      int[][] matrix3 = new int[2][3];
      int[][] addRes;
      int[][] multRes;
      int[][] m = {{3,2,4},{5,1,3},{2,3,1}};
      
      
      
      System.out.println("tamanho das matrizes:");
      System.out.printf("Matriz 1: %d,%d\n",matrix1.length, matrix1[0].length);  
      showMatrix(matrix1);
      
      System.out.printf("Matriz 2: %d,%d\n",matrix2.length, matrix2[0].length);  
      showMatrix(matrix2);
      
      System.out.printf("Matriz 3: %d,%d\n",matrix3.length, matrix3[0].length);  
      showMatrix(matrix3);
      
      System.out.printf("Matriz 4: %d,%d\n",m.length, m[0].length);  
      showMatrix(m);
      
      
      
      System.out.println("Matrix 1 + matrix 2");
      if(validate(matrix1,matrix2,"adicao")){
          addRes = addMatrix(matrix1, matrix2);
          showMatrix(addRes);
      }      
      
      System.out.println("Matrix 1 + Matrix 3");
      if(validate(matrix1,matrix3,"adicao")){
          addRes = addMatrix(matrix1, matrix2);
          showMatrix(addRes);
      }
      
      System.out.println("Matrix 2 + Matrix 3");
      if(validate(matrix2, matrix3, "adicao")){
          addRes = addMatrix(matrix2, matrix3);
          showMatrix(addRes);
      }
      
      
      System.out.println("Matrix 1 x Matrix 2");
      if(validate(matrix1, matrix2, "mult")){
          multRes = multiplyMatrix(matrix1, matrix2);
          showMatrix(multRes);
      }
      
      System.out.println("Matrix 1 x Matrix 3");
      if(validate(matrix1, matrix3, "mult")){
          multRes = multiplyMatrix(matrix1, matrix3);
          showMatrix(multRes);
      }
      
      System.out.println("Matrix 2 x Matrix 3");
      if(validate(matrix2, matrix3, "mult")){
          multRes = multiplyMatrix(matrix2, matrix3);
          showMatrix(multRes);
      }
      
      
      
      
        System.out.println("O determinante da seguinte matrix:");
        showMatrix(m);
        if(validate(m, m, "det")){
            System.out.println("Determinante: "+det(m));
        }
        
        System.out.println("O determinante da seguinte matrix:");
        showMatrix(matrix1);
        if(validate(matrix1, matrix1, "det")){
            System.out.println("Determinante: "+det(matrix1));
        }
        
        System.out.println("O determinante da seguinte matrix:");
        showMatrix(matrix2);
        if(validate(matrix2, matrix2, "det")){
            System.out.println("Determinante: "+det(matrix2));
        }
      
      System.out.println("Transpoda da matrix 1:");
      showMatrix(transpota(matrix1));
      
      System.out.println("Transpoda da matrix 2:");
      showMatrix(transpota(matrix2));
      
      System.out.println("Transpoda da matrix 3:");
      showMatrix(transpota(matrix3));
      
      System.out.println("Transpoda da matrix 4:");
      showMatrix(transpota(m));
    }
    public static boolean validate(int[][] m1,int[][] m2, String count){
        switch (count){
            case "mult":
                if(m1[0].length==m2.length){// Multiplicar
                    return true;
                }else{
                    System.out.println("O tamanho da coluna da primeira é"
                            + " diferente da segunda! Não pode multiplicá-las");  
                    return false;
                }
                
            case "adicao":
                if(m1.length== m2.length){// Soma
                    // Se o num de linhas for igual
                    for(int l=0; l<m1.length;l++){
                      if (m1[l].length==m2[l].length){
                          // Se o tamanho de TODAS colunas for igual
                          if(l==(m1.length)-1){// Se for última iteração
                              System.out.println("Soma");  
                              return true;
                          }
                      }else{
                          System.out.println("As matrizes tem tamanhos diferen"
                                  + "tes, não pode somá-las");  
                          return false;
                      }
                    }
                    }else{
                        System.out.println("Número de linhas incompatível para soma");
                        return false;
                    }
                
            case "det":
                if(m1.length== m1[0].length){
                    System.out.println("É uma matriz quadrada");
                    return true;
                }
                System.out.println("Não é uma matrix quadrada");
                return false;
            default:
                System.out.println("Tipo de conta incompatível");
                return false;
        } 
    }
        
        
    public static void showMatrix(int[][] m){
        int lines = m.length;
        int colums = m[0].length;
        
        String out="";
        for(int l =0; l<lines;l++){
            out+= "[";
            for(int c =0;c<colums;c++){
                if((c+1<colums)){
                    out+=m[l][c]+",";
                }else{
                    out+=m[l][c];
                }
            }
            out+="]\n";
        }
        System.out.println(out);
        
    }
    
    public static int[][] addMatrix(int[][] ar1, int[][] ar2){
        
        int lines = ar1.length;
        // numero de linhas das arrays
        
        int colums = ar1[0].length;
        // Número de colunas das array, passando por cada linha
        int[][] soma = new int[lines][colums];
        
        for(int l=0;l<lines;l++){
            for(int c=0; c<colums;c++){
                
                soma[l][c] = ar1[l][c] + ar2[l][c];
            }
        }
        
        return soma;
    }
        
    
    public static int[][] multiplyMatrix(int[][]ar1,int[][] ar2){
        int lines = ar1.length;
        // numero de linha da 1 array
        
        int colums = ar2[0].length;
        // Número de colunas da 2 array
        
        int lineSize = ar2.length;
        int columSize = ar1[0].length;
        //Para fazer a conta
        
        
        int res[][] = new int[lines][colums];
        // Cria o array de saida
        
        
        for(int l=0;l<lines;l++){
            // Soma pelas linhas
            
            for(int col=0; col<colums;col++){ 
                // Soma passando pelas colunas
                    
                int value=0;
                for(int c=0;c<columSize;c++){// Faz a soma das n colunas
                
                    value += ar1[l][c] * ar2[c][col];// Inverte a coluna e linha
                    
                }
                res[l][col] = value;
            }
            
        }
        
        return res;
    }
    
    public static int det(int[][] m){
        int h = m.length;
        int a = 0;
        int b =0;
        int det=0;
        int aux =1;

        int[] array = new int[h+2];
        int c=0;
        for(int i=0;i<array.length;i++){
            /*          
                Array usada como referencia das colunas na hora da conta
                em diagonal
            */
            
            array[i]= c;
            if(c==h-1){
                c=0;
            }else{

            c++;
            }
        }
      
      
        int[] arrayr = new int[h+2];
        /*
         Array invertida, usada para fazer a conta pelas diagonais, no sentido
        inverso
        */
        c=h-1;
        for(int i=0;i<arrayr.length;i++){
           arrayr[i]= c;
           if(c==0){
               c=h-1;
           }else{
               c--;
           }
        }
      
      a += detLoop(array, h, m, 1);
      a += detLoop(array, h, m, 2);
      a += detLoop(array, h, m, 3);
        
      b+= detLoop(arrayr,h,m,-1);
      b+= detLoop(arrayr,h,m,-2);
      b+= detLoop(arrayr,h,m,-3);
      
      det = a-b;
      
      
      return det;
    }
    public static int detLoop(int[] array,int h,int[][] m,int type){
        int aux =1;
        switch (type){
            case 1:
                for(int l =0; l<h;l++){//1 diagonal
                    int col = array[l];// contador para a coluna
                    aux *= m[l][col];
                }
                break;
            case 2:
                for(int l =0; l<h;l++){//2 diagonal
                    int col = array[l+1];// contador para a coluna
                    aux *= m[l][col];
                }
                break;
            case 3:
                for(int l =0; l<h;l++){//3 diagonal
                    int col = array[l+2];// contador para a coluna
                    aux *= m[l][col];
                }
                break;
            case -1:
                for(int l=0;l<h;l++){// 1 Diagonal Invertida
                    int col = array[l];
                    aux *= m[l][col];
                }
                break;
            case -2:
                for(int l=0;l<h;l++){// 2 Diagonal Invertida
                    int col = array[l+1];
                    aux *= m[l][col];
                }
                break;
            case -3:
                for(int l=0;l<h;l++){// 3 Diagonal Invertida
                    int col = array[l+2];
                    aux *= m[l][col];
                }
                break;
                    
        }
        return aux;
    }
    public static int[][] transpota(int[][] m){
        int linha = m.length;
        int coluna = m[0].length;

        int[][] transpota = new int[coluna][linha];
        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                transpota[c][l] = m[l][c];// Inverte coluna e lina
                
            }
        }
        return transpota;
    }
}

      
      
    

