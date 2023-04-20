public class Main {
    public static void main(String[] args) {
        for(int i = 1 ; i<=10 ; i++){
            System.out.print(i+" | ");
            for(int ii = 1 ; ii<=10 ; ii++){
                if (ii==10){
                    System.out.println(i*ii+" ");
                }else{
                    System.out.print(i*ii+" ");
                }
            }
        }
    }
}