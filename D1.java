public class Main {
    public static int findIndexEqualValue(int[] A) {
        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (A[mid] == mid) {
                return mid; // พบดัชนีที่ i = A[i]
            } else if (A[mid] > mid) {
                high = mid - 1; // ตรวจสอบในครึ่งซ้าย
            } else {
                low = mid + 1; // ตรวจสอบในครึ่งขวา
            }
        }
        return -1; // ถ้าไม่พบค่าที่ i = A[i]
    }

    public static void main(String[] args) {
        int[] A = {-10, -5, 0, 3, 7}; // ตัวอย่างอาร์เรย์
        int result = findIndexEqualValue(A);
        System.out.println("Index where A[i] = i: " + result);
    }
}
