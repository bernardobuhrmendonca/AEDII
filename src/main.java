
    public class main {
        public static double s(int n){
            int i =1;
            double resp = 0;
            resp = s(i, n, resp);
            return resp;
        }

        private static double s(int i, int n, double s){
            if (i < n){
                s = s + s( (i+1), n, (double) ((i * i) + 1) / (i + 3) );
            }
            return s;
        }

        public static void main(String[] args) {
            double res = s(5);
            System.out.println(res);
        }
    }


