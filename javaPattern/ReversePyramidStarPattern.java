class ReversePyramidStarPattern {
  public static void main(String[] args) {
      int height = 4;  

      for (int i = height; i >= 1; i--) {
          
          for (int j = height; j > i; j--) {
              System.out.print(" ");
          }
        
          for (int k = 1; k <= (2 * i - 1); k++) {
              System.out.print("*");
          }
         
          System.out.println();
      }
  }
}