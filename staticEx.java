 class staticEx
{
int num;
static int value;  
static{
        System.out.println("static block");
}
       public static void message(){
             System.out.println("static value=+value");
}
        public void access(){
        System.out.println("num="+num+",static value="+value); 
}
}
public class staticDemo{
      public static void main(String args[]){
      staticEx.message();
      staticEx ex=new staticEx();
      ex.num=30;
      ex.value=50;
      staticEx.message();
      ex.access();
}
}
