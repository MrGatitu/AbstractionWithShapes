public class Square extends abstractShape {

    
    @Override
    public double area(double _length, double _width){
        return _length * _length;
    }


    public static void main(String[] args) {
        Square newSquare = new Square();
        double _area = newSquare.area(5.0, 0);
        double _perimetre = newSquare.perimetre(6.0,6.0);

        System.out.println(_area);
        System.out.println(_perimetre);
    }
}
