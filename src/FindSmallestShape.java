public class FindSmallestShape{
    public static void main(String[] args){
        Rectangle rec=new Rectangle();
        Square sqr=new Square();
        Circle cir=new Circle();
        int a=rec.getArea(4,5);
        int b=sqr.getArea(4);
        int c=cir.getArea(4);
        int d=Math.max(a,b);
        int e=Math.max(b,c);
        if(d==e){
            System.out.println("Largest area : "+ e);
            System.out.println("Second largest area : "+Math.max(a,c));
            System.out.println("Smallest area : "+ Math.min(a,c));
            System.out.println("Second smallest area : "+Math.max(a,c));
            System.out.println("Area of Rectangle : "+a+"\nArea of Square : "+b+"\nArea of Circle : "+c);
        }
        else{
            int g=Math.max(d,e);
            System.out.println("Max area : "+g);
            System.out.println("Second largest area : "+(d+e-g));
            System.out.println("Smallest area : "+ (a+b+c-g-(d+e-g)));
            System.out.println("Second smallest area : "+(d+e-g));
            System.out.println("Area of Rectangle : "+a+"\nArea of Square : "+b+"\nArea of Circle : "+c);
        }
    }
}
