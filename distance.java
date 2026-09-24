public class distance{
    double feet;
    double inch;
    distance(){
        feet=0;
        inch =0;

    }
    distance(double feet,double inch){
        this.feet = feet;
        this.inch = inch;


    }
    void display(double feet,double inch){
        System.out.println("feet:"+feet);
        System.out.println("inch:"+inch);
    }
    public static void main (String [] args){
        distance obj1=new distance();
        distance obj2=new distance(10,16);
        System .out .println ("-----The output constructor without arguments---");
        obj1.display(obj1.feet,obj1.inch);
        System .out .println ("-----The output constructor with arguments---");

        obj2.display(obj2.feet,obj2.inch);
    }
}