package Charan.ObjectOrinetedProgramming.OOPS_PRINCIPLES.Interfaces.NestedInterface;

public class A {
    // nested interface
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
