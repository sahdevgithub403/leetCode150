import java.util.ArrayList;
import java.util.List;

public class ZigZag {
    public String convert(String s, int numRows) {
        int n = s.length();
        if (numRows == 1 || n <= numRows) {
            return s;
        }

        // Create a list of StringBuilder for each row
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int currRow = 0;
        int step = 1; // direction: 1 = down, -1 = up

        // Build each row
        for (char c : s.toCharArray()) {
            rows.get(currRow).append(c);

            if (currRow == 0)
                step = 1;
            else if (currRow == numRows - 1)
                step = -1;

            currRow += step;
        }

        // Combine all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ZigZag zg = new ZigZag();

        String s = "PAYPALISHIRING";
        int numRows = 3;

        // Call the convert method correctly
        String result = zg.convert(s, numRows);

        // Print the result
        System.out.println("ZigZag Conversion: " + result);
    }
}
