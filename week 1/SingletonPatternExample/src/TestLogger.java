public class TestLogger {
    public static void main(String[] args) {
        Logger l1=Logger.getInstance();
        l1.log("1st message");
        Logger l2=Logger.getInstance();
        l2.log("2nd message");
        if(l1==l2){
            System.out.println("Both are same instances");
        }
    }
}
