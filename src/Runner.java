public class Runner {
    public static void main(String[] args){
        Car lilah= new Car (2019, 0, "audi") ;
        int miles=lilah.getMiles();
        lilah.drive(100);
        System.out.println(lilah.toString());
        Rectangle rect = new Rectangle (3,6);
        System.out.println(rect.getArea());
        System.out.println(rect.getDiagonal());
        System.out.println(rect.isSquare());






    }
}
