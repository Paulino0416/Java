class TestaWhile {

    public static void main(String[] args) {
        int contador = 0;

        while(contador <= 10) { // o que está dentro do while n é temporário
            System.out.println(contador);
            contador += 1; // ou ++contador;
        }
        System.out.println("Fora do While: "+ contador); // mostrar 11
    }
}
