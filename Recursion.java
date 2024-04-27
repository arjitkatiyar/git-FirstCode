

class Recursion {
    public static void RecusionDemo(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        RecusionDemo(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        RecusionDemo(n);
    }
    
}