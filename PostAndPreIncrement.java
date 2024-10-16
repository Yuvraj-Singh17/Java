public class PostAndPreIncrement {
    public static void main(String[] args) {
        //Post Increment
        //for e.g. a++ --> this is the sign of Post Increment 
        //where , a is any integer and I am performing Post Increment
        int num = 99 ; 
        int result1 = num++;//it will fetch the value than increment
        System.out.println(result1);
        int num2 = 999;
        int result2 = ++num2;//it will first increase the value and then fetch 
        System.out.println(result2);
    }
}
