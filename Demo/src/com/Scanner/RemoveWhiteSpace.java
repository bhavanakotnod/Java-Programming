package stringProblem;

// Remove all white spaces from string
public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "    bhavana kotnod";
        String allSpaceRemoved = str.replaceAll("\\s+", "");
        System.out.println("All white space removed: " + allSpaceRemoved );
    }
}

