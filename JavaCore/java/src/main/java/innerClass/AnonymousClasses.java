package innerClass;

import java.util.Comparator;
import java.util.List;

public class AnonymousClasses {
    public static class Robot {
        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething() {
            greetingModule.sayHello();
        }
    }


}
