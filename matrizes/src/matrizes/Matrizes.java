/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizes;

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
      
      
      
      System.out.println("tamanho das matrizes:");
      System.out.printf("Matriz 1: %d,%d\n",matrix1.length, matrix1[0].length);  
      showMatrix(matrix1);
      
      System.out.printf("Matriz 2: %d,%d\n",matrix2.length, matrix2[0].length);  
      showMatrix(matrix2);
      
      System.out.printf("Matriz 3: %d,%d\n",matrix3.length, matrix3[0].length);  
      showMatrix(matrix3);
      
      
      
      
      
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
      
    }
    public static boolean validate(int[][] m1,int[][] m2, String count){
        switch (count){
            case "mult":
                if(m1[0].length==m2.length){// Multiplicar
                    return true;
                }else{
                    System.out.println("O tamanho da coluna da primeira é diferente da segunda! Não pode multiplicá-las");  
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
                          System.out.println("As matrizes tem tamanhos diferentes, não pode somá-las");  
                          return false;
                      }
                    }
                    }else{
                        System.out.println("Número de linhas incompatível para soma");
                        return false;
                    }
                
            case "det":
                if(m1.length==m2.length && m1[0].length == m2[0].length){
                    System.out.println("São matrizes de tamanho igual");
                    return true;
                }
                System.out.println("São matrizes de tamanho diferente");
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
}

      
      
    

