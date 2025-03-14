public class TestarLacos {
    public static void main(String[] args) {
        for(int multiplicador = 1; multiplicador <= 10; multiplicador++){
            System.out.print("Tabuada do "+ multiplicador + ": ");
            for(int contador = 1; contador <= 10; contador++){
                System.out.print(multiplicador * contador);// valor
                System.out.print(" "); // espaço
            }
            System.out.println();// pula linhas
        }
    }
}
