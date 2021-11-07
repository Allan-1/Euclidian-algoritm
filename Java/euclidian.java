package Java;

class Euclidian{
    static int gcd(int x, int y){
        if(y > x){
            int temp = y;
            y = x;
            x = temp;
        }else{
        }
        while (true){
            if(x % y == 0){
                return x / y;
            }else{
                int a = x % y;
                int b = y % a;
                if (a == 0){
                    return b;
                }else if(b == 0){
                    return a;
                }else{
                    continue;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 6));
    }
}