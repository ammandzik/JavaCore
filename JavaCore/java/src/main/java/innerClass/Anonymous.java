package innerClass;

class Anonymous {


    GreetingModule gm = new GreetingModule() {
        @Override
        public void sayHello() {
            System.out.println("Helloo!");
        }
    };

    TestAnonymous ta = new TestAnonymous() {
        @Override
        public String hello() {
            return "Hello Local class " + ta.getClass() ;
        }
    };

    TestAnonymous ta2 = new TestAnonymous() {
        @Override
        public String hello() {
            return "Hello second Local class " + ta2.getClass() ;
        }
    };

    public interface GreetingModule {
        void sayHello();
    }


}


