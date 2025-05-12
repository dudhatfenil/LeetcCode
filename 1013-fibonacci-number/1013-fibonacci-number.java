class Solution {
    public int fib(int n) {
        if (n <= 1){
            return n;
        }

        return fib(n-1) + fib(n -2);

        
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      Solution obj = new Solution();

      System.out.println("Fibonacci Seris up to " + n + " terms:");

      for(int i = 0; i < n; i++){
        System.out.print(obj.fib(i) + " ");
      }
    
    
    }


}
