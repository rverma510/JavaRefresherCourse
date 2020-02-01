public class InstanceInitializationBlock {
    private int x;
    {
        System.out.println("Initialization Block : x = " + x);
        x = 5;
    }
    public InstanceInitializationBlock(){
        System.out.println("Constructor : x = " + x);
    }
    public static void main(String[] args){
        StaticInitializationBlock obj1 = new StaticInitializationBlock();
        StaticInitializationBlock obj2 = new StaticInitializationBlock();
    }
}
