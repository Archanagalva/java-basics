 public class Rectangle{
 int length,breadth;
int area(int l, int b){
return l*b;
}
int perimeter(int l, int b)
{
return 2*(l+ b);
}
  public static void main(String args[]){

Rectangle r=new Rectangle();
int area=r.area(20,30);
System.out.println("area=" + area);
System.out.println("perimeter="+r.perimeter(20,30));
}
}