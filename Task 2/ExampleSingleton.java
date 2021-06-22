public class ExampleSingleton {
    private int accessCount;
    private static final ExampleSingleton exInstance = new ExampleSingleton();

    private ExampleSingleton() {
        System.out.println("I, the ExampleSingleton, am being created");
    }
    public static ExampleSingleton getInstance(){
        System.out.println("The sole instance of ExampleSingleton is being retrieved");
        return exInstance;
    }
    public int accessCount(){
        return  accessCount = accessCount + 1 ;
    }
}
