public  class Main {
    public static void main(String[] args) {
        int n=13;
        
         
      
        System.out.println(sumOfDigits(n));
    }

  public static int sumOfDigits(int n) {
 

    int q = 0;
    int r = 0;
    int sum = 0;

    while(q==0) {
        q = n / 2;
        r = q % 2;
        sum += r;
    }
    return sum;

  }
    
}
