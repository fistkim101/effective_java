package item8_new;

import java.lang.reflect.Field;

public class OuterClass {

    class InnerClass {

        public void printAllFields() {
            Class<InnerClass> innerClass = InnerClass.class;
            for (Field field : innerClass.getDeclaredFields()) {
                System.out.println("Name : " + field.getName());
                System.out.println("Type : " + field.getType());
            }
        }

    }

}
