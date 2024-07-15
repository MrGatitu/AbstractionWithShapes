public class Circle extends abstractShape {

    @Override
    public double area(double _length, double _width){
        // length in this case is the diametre
        double diametre = _length;

        double _areaCircle = (22 / 7) * (diametre /2)*(diametre /2);

        return _areaCircle;
    }

    @Override
    public double perimetre(double _length, double _width){
        // length in this case is the diametre
        double diametre = _length;
        double _perimetre = (22/7) * diametre;

        return _perimetre;
    }

    public static void main(String[] args) {
         Circle circle = new Circle();
         
         System.out.println(circle.area(16, 0));
         System.out.println(circle.perimetre(21, 0));
    }

    
}
