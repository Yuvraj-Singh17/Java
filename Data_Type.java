public class Data_Type {
    //There are two DataType --> 1.Primitive 2.Non-Primitive
    //Primitive DataTypes are the datatypes that are predefined 
    //Primitive Dataypes are as follows :--> 1.Integer 2. Float 3.Character 4.Boolean
    //1.Integer means Number , it is of 4 types --> 1.int = 4 bytes 2.long = 8 bytes 3.short = 2 bytes 4.byte = 1 byte
    public static void main(String[] args) {
        //Primitive ---> Integer 
        int a = 10;
        long b = 100000l;
        short c = 7;
        byte d = 1;
        //Primitive ---> Float
        // Decimal Point numbers are also called floating point number 
        // 1. Float   2.Double
        //By default every decimal number is double so we have to explicitily cast it into float
        float e = 5.5f;
        double f = 100.9;
        // Primitive ---> Character
        char g = 'V';
        //Primitive ---> String 
        String h = "Virat Kohli";
        // Primitive --> Boolean
        boolean i = true;
        byte [] arr = {1,127,0,1};//127 is the last value for byte
        System.out.println(a);
        System.out.println(b); 
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
    