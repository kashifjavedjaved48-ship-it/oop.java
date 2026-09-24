public class mark{
    int Physics;
    int math;
    int Bio;
    mark (){
        Physics=0;
        math =0;
        Bio=0;
    }
    mark(int physics, int math, int bio){
        this.Physics = physics;
        this.math = math;
        this.Bio = bio;

    }
    double sum (double a ,double b ,double c){
        return a+b+c;

    }
    void display (double d){
        System.out.println("The Sum of total marks : "+d);
    }


    public static void main (String [] args){
        mark obj1 = new mark ();
        mark obj2 = new mark(70,60,90);
        double sumed=obj2.sum(obj2.Physics,obj2.math,obj2.Bio);
        obj2.display(sumed);

    }
}