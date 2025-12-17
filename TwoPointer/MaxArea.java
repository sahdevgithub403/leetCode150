public class MaxArea {

    public int maxArea(int[] height) {
        int leftbar = 0;
        int rightbar = height.length - 1;
        int maxAreaW = 0;

        while (leftbar < rightbar) {
            int currArea = Math.min(height[leftbar], height[rightbar]) * (rightbar - leftbar);
            maxAreaW = Math.max(maxAreaW, currArea);

            if (height[leftbar] < height[rightbar]) {
                leftbar++;
            } else {
                rightbar--;
            }
        }
        return maxAreaW;

    }

    public static void main(String[] args) {
        MaxArea ma = new MaxArea();

        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result = ma.maxArea(height);
        System.out.println("Result : " + result);
    }
}
