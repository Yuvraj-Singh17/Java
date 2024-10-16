public class TypeConversionAndCasting {
    public static void main(String[] args) {
        //Type Casting ---> When we do explicit conversion it is called Type Casting
        //Explicit means we are doing it by ourself
        //Explicit -> putting larger size datatype value to smaller size datatype variable
        //For e.g. Long-->int ,Double==>Float 
        int a = 129;
        byte b = (byte)a;//
        double c = 111111111111111111.11;
        float d = (float)c;
        int e = 257;
        byte f = (byte)e;
        float g = 2.345f;
        int h = (int) g;
        System.out.println(b);
        System.out.println(d);
        System.out.println(f);
        System.out.println(h);

        // Type Conversion ---> When we implicitly convert any value it is called Type Conversion
        // Implicit means Java do it for us
        // Implicit -> putting smaller size value in big size variable 
        // For e.g. byte-->int , int-->Long
        int a1 = 1000;
        long b1 = a1;
        float c1 = 5.05f;
        double d1 = c1;
        byte e1 = 30;
        int f1 = 10;
        int resultOfe1Andf1 = e1 * f1;
        System.out.println(b1);
        System.out.println(d1);
        System.out.println(resultOfe1Andf1);
    }
}
