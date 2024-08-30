package Charan.ObjectOrinetedProgramming.StaticExamples;

public  class OuterClasses {

    public static class Test {
        String name;
        String namee;
        public Test(String name, String namee) {

            this.name = name;
            this.namee = namee;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("charan", "pramod");
        Test b = new Test("pramod", "charan");

        System.out.println(a);

//        System.out.println(a.name);
//        System.out.println(b.name);


    }


}
