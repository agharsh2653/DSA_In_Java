package Arrays;

public class NTimesMatrix {
        final static int MOD = 1000000007;

    public static void main(String[] args) {
        int ans = firstElement(45);
        System.out.println(ans);
    }

        public static int firstElement(int n) {
            // Initialize the original matrix
            long[][] A = {{1, 1}, {1, 0}};
            // Initialize the result matrix to the identity matrix
            long[][] result = {{1, 0}, {0, 1}};

            // Perform matrix exponentiation
            while (n > 0) {
                if (n % 2 == 1) {
                    result = multiply(result, A);
                }
                A = multiply(A, A);
                n /= 2;
            }

            // Return the a10 element of the result matrix mod 1000000007
            return (int) (result[1][0] % MOD);
        }

        // Function to multiply two matrices
        private static long[][] multiply(long[][] A, long[][] B) {
            long[][] C = new long[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
                    }
                }
            }
            return C;
        }

}
