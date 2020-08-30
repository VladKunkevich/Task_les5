public class Main {
    public static void main(String[] args) {
        Test2 o = new Test2();

        System.out.println("a: " + o.getA());
        System.out.println("b: " + o.getB());
        System.out.println(" ");

        o.setA(52);
        o.setB(48);

        System.out.println("a: " + o.getA());
        System.out.println("b: " + o.getB());
        System.out.println("");

        o = new Test2(8, 9);

        System.out.println("a: " + o.getA());
        System.out.println("b: " + o.getB());


    }
}

class Test2{
    public int a, b;

    public Test2(){
        a = 1;
        b = 4;
    }

    public Test2(int a1, int b1){
        a = a1;
        b = b1;
    }

    public int getA(){

        return a;
    }

    public int getB(){

        return b;
    }

    public void setA(int a1){

        a = a1;
    }

    public void setB(int b1){

        b = b1;
    }
}
