// Task 1
// Creating the class

 public class circle{
    double radius ;
    double circum;
    // Consructor with no arguement
    circle(){
        radius = 0;
    }
    // Constructor with argument
    circle(double radius ){
        this.radius =radius;
    }
    // MAKING A METHOD
    double circumference(){
        return 2*3.14*radius;

    }
    void display(double circum){
        System.out .printf("The circumference is %.2f:",circum);
    }
    public static void main (){
        circle ob1 = new circle();

        circle ob2 = new circle (10.00);
        ob2.circum = ob2.circumference();
        ob2.display(ob2.circum);



    }


}