public class TestaSomatorio {
    public static void main(String[] args){
        int contador = 0;
        int total = 0;

        while(contador <= 10){
            total += contador;
            contador++;
            System.out.println(total);
        }
        System.out.println("Fora do While: "+ total);
    }
}
