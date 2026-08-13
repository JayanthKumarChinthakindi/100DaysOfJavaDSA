public class StringBuilderOperations {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Original:");
        System.out.println(sb);
        // append()
        sb.append(" Programming");
        System.out.println("\nAfter append:");
        System.out.println(sb);
        // insert()
        sb.insert(5, "Language ");
        System.out.println("\nAfter insert:");
        System.out.println(sb);
        // delete()
        sb.delete(5, 14);
        System.out.println("\nAfter delete:");
        System.out.println(sb);
        // deleteCharAt()
        sb.deleteCharAt(0);
        System.out.println("\nAfter deleteCharAt:");
        System.out.println(sb);
        // setCharAt()
        sb.setCharAt(0, 'K');
        System.out.println("\nAfter setCharAt:");
        System.out.println(sb);
        // replace()
        sb.replace(0, 4, "Java");
        System.out.println("\nAfter replace:");
        System.out.println(sb);
        // reverse()
        sb.reverse();
        System.out.println("\nAfter reverse:");
        System.out.println(sb);
        // Convert to String
        String result = sb.toString();
        System.out.println("\nConverted to String:");
        System.out.println(result);
    }
}