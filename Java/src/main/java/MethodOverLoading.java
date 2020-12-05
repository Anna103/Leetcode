public class MethodOverLoading {
    public int add(int a, int b){
        return a + b;
    }

    // Has to have different datatype for input argument and different return type too
    public double add(double a, double b){
        return a + b;
    }
}
