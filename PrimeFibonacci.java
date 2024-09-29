public class PrimeFibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        while (b < 100) {
            if (isPrime(b)) {
                System.out.println(b);
            }
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i--) {
            if (num % i == 0) return false;
        }
        return true;
    }
}