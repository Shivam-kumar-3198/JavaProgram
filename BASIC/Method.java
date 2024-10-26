package JavaProgram.BASIC;
class Cal 
{
    void add(int a, int b){
        System.out.println(a+b);
    }

    void add(int a, float b){
        System.out.println(a+b);
    }

    void add(float a, float b){
        System.out.println(a+b);
    }
    
    void add(double a , double b){
        System.out.println(a+b);
    }

}

class Method
{
    public static void main(String args[])
    {
        Cal obj = new Cal();
        obj.add(23,45);
        obj.add(23,45.5f);
        obj.add(23.45,45.67);
        obj.add(34.567,45.678);
    }
}