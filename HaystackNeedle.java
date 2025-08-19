public class HaystackNeedle {
    public static void main(String[] args) {
        String haystack = "This is a simple haystack string.";
        String needle = "haystack";
        int index = haystack.indexOf(needle);
        if (index != -1) {
            System.out.println("Found '" + needle + "' at index: " + index);
        } else {
            System.out.println("Needle not found in haystack.");
        }
    }
}