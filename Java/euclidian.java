package Java;

class Euclidian{
    static int gcd(int x, int y){
        while (true){
            while(true){
                if(x % y == 0){
                    return y;
                }
                int a = x % y;
                int b = y % a;
                if (a == 0){
                    return b;
                }else if(b == 0){
                    return a;
                }
                a = a % b;
                b = b % a;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(gcd(15, 6));
    }
}