public class Main {
    public static void main(String[] args) {
        for (int i = 1 ; i<=4 ; i++){
            for (int ii = 1 ; ii<=i ; ii++){
                if(ii==i){
                    System.out.println("*");
                }else{
                    System.out.print("*");
                }
            }
        }
    }
}