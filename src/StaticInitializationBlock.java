public class StaticInitializationBlock {
    private static int x;
    static {
        System.out.println("Initialization Block : x = " + x);
        x = 5;
    }
    public StaticInitializationBlock(){
        System.out.println("Constructor : x = " + x);
    }
    public static void main(String[] args){
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock();
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();
    }
}
