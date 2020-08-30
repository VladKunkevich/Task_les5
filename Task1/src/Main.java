public class Main {
    public static void main(String[] args) {
        Test1 ob = new Test1();

        System.out.println("a: " + ob.a);
        System.out.println("b: " + ob.b);
        System.out.println("max: " + ob.max());
        System.out.println("sum: " + ob.sum());
        System.out.println("");

        ob.a = 48;
        ob.b = 52;

        System.out.println("a: " + ob.a);
        System.out.println("b: " + ob.b);
        System.out.println("max: " + ob.max());
        System.out.println("sum: " + ob.sum());
        System.out.println("");

        ob.b = 498;

        System.out.println("a: " + ob.a);
        System.out.println("b: " + ob.b);
        System.out.println("max: " + ob.max());
        System.out.println("sum: " + ob.sum());
    }
}

class Test1{
    public int a, b;

    public int max(){
        if(a > b)
            return a;
        return b;
    }
    public int sum(){
        return a + b;
    }
}
