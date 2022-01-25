class father extends mask{
    public void differentPoint(){
        System.out.println("I have the super power");
    }
}
class mother extends mask{
    public void differentPoint(){
        System.out.println("I can unlimited elongation");
    }
}
public class Incredibles {
    public static void main(String[] args) {
        father Bob = new father();
        Bob.mask();
        Bob.uniform();
        Bob.differentPoint();
        mother Helen = new mother();
        Helen.mask();
        Helen.uniform();
        Helen.differentPoint();
    }
}
