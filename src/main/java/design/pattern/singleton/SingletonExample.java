package design.pattern.singleton;


public class SingletonExample {
    private static SingletonExample uniqueinstance;
    String hello;
     private SingletonExample(String hello){
         this.hello = "wassup bitch";
         Println(hello);
         this.hello = hello;
         Println(hello);
     }
     public static SingletonExample getInstance(){
         if(uniqueinstance ==null){
             uniqueinstance = new SingletonExample("hello bruh");
         }
         return uniqueinstance;
     }

     void Println(Object line){
         System.out.println(line);
     }
    public static void main(String[] args) {
        SingletonExample.getInstance();

    }
}

