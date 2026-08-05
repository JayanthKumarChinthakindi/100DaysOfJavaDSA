public class NestedIfDemo {
    public static void main(String[] args) {
        int age = 22;
        boolean hasLicense = true;
        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You can drive.");
            } else {
                System.out.println("Get a Driving License.");
            }
        } else {
            System.out.println("You are not eligible to drive.");
        }
    }
}