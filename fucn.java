//  class fucn {
//     void sayhello(){
//         System.out.println("hello abxc");

//     }
//     public static void main(String [] args){
//         fucn obj=new fucn();
//         obj.sayhello();

//     }
//  }
    

// class fucn{
//     static int add(int x,int y){
//         int sum=x+y;
//     System.out.println("sum is:"+sum);
//     return sum;
//     }
//     public static void main(String [] args){
//         int x=10;
//         int y=20;
//         fucn obj=new fucn();
//         obj.add(x,y);
//     }

// }

class fucn{
    static void greet (){
        System.out.println("hello , This is static method from anither classs");

    }
    public static void main(String [] args){
        fucn.greet();

    }
}