public void localVariableExample() {
    int localVar = 10; // Local variable
    System.out.println("Local Variable: " + localVar);
}
public class Example {
    int instanceVar; // Instance variable

    public Example(int value) {
        this.instanceVar = value;
    }

    public void instanceVariableExample() {
        System.out.println("Instance Variable: " + instanceVar);
    }
}
public class Example {
    static int staticVar = 5; // Static variable

    public static void staticVariableExample() {
        System.out.println("Static Variable: " + staticVar);
    }
}
