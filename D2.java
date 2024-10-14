public class Main {
    public static int findMissingValue(int[] A, int m) {
        // คำนวณผลรวมที่ควรจะเป็นสำหรับค่าจาก 1 ถึง m
        int expectedSum = m * (m + 1) / 2;

        // คำนวณผลรวมของอาร์เรย์ที่มี
        int actualSum = 0;
        for (int num : A) {
            actualSum += num;
        }

        // ผลรวมที่หายไปจะเป็นค่าสูญหาย
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 4, 5, 6}; // ตัวอย่างอาร์เรย์ ค่าที่ 3 หายไป
        int m = 6; // ค่า m สูงสุด
        int missingValue = findMissingValue(A, m);
        System.out.println("Missing value: " + missingValue);
    }
}
//แสดงผล
//Missing value: 3
