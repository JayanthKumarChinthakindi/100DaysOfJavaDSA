public class ScopeDemo {
    // Instance variable
    int instanceVariable = 20;
    // Static variable
    static int staticVariable = 30;
    static void demonstrateLocalScope() {
        // Local variable
        int localVariable = 10;
        System.out.println("Local Variable = " + localVariable);
    }
    void demonstrateInstanceScope() {
        System.out.println("Instance Variable = " + instanceVariable);
    }
    static void demonstrateStaticScope() {
        System.out.println("Static Variable = " + staticVariable);
    }
    public static void main(String[] args) {
        System.out.println("Scope Demonstration\n");
        // Local variable
        int mainVariable = 100;
        System.out.println("Main Variable = " + mainVariable);
        // Local scope method
        demonstrateLocalScope();
        // Static variable
        demonstrateStaticScope();
        // Instance variable requires an object
        ScopeDemo obj = new ScopeDemo();
        obj.demonstrateInstanceScope();
    }
}