package com.amigoscode._2_developers._4_accessmodifiers;

/**
 * Access Modifiers Demo
 *
 * Demonstrates how different access modifiers behave when accessing members
 * from another class in the SAME package. Complete the AccessModifiers class first.
 */
public class AccessDemo {

    public static void main(String[] args) {
        // TODO: 1 - Create an instance of AccessModifiers.
        AccessModifiers accessMod = new AccessModifiers();
        System.out.println("=== Calling Public Method ===");
        // TODO: 2 - Call the publicGreeting() method on your instance and print the result.
        //  This works because public methods are accessible from anywhere.
        String publicGreet = accessMod.publicGreeting();
        System.out.println(publicGreet);
        System.out.println("\n=== Calling Package-Private Method ===");
        // TODO: 3 - Call the packageGreeting() method on your instance and print the result.
        //  This works because AccessDemo is in the SAME package as AccessModifiers.
        String packageGreet = accessMod.packageGreeting();
        System.out.println(packageGreet);
        System.out.println("\n=== Accessing Private Field Through Getter ===");
        // TODO: 4 - Use setSecret() to set a value, then use getSecret() to read it back.
        //  Print the result. This demonstrates proper encapsulation:
        //  we access the private field only through public getter/setter methods.
        accessMod.setSecret("Hello");
        System.out.println(accessMod.getSecret());

        System.out.println("\n=== Why Direct Private Access Won't Work ===");
        // TODO: 5 - Write a comment explaining why the following line would NOT compile:
        //  Then leave the line commented out, preceded by your explanation.
        //  Hint: think about what 'private' means for field visibility outside the class.
        /*
            instance.secret does not work because the secret is private so that means it can only be accessed within the same class. The setter and getter allow controlled access to that private attribute.

         */
        // instance.secret = "trying direct access";

    }
}
