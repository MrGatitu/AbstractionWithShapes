public class abstractShape implements shape {


    @Override
    public double area(double _length, double _width){
        return _length * _width;
    }

    @Override
    public double perimetre(double _length, double _width) {
        double formula = (_length * 2) + (_width*2);
        return formula;
    }
}
