class unaryOperator{
  public static void main(String args[])
  {
    int a = 10;
    
    System.out.println(a++);  //10 (11)
    System.out.println(++a);  //12 (12)
    System.out.println(a--);  //12(11)
    System.out.println(--a);  //10 (10)
    
    int b = 10;
    
    System.out.println(a++ + ++a);  //10+12 = 22
    System.out.println(++b + b++);  //11+11 = 22
    System.out.println(b++ + b++);  //11+12 = 23
  }
}
