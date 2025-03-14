class Caracteres {
    public static void main(String[] args){

        char letra = 'b'; //só pode usar aspas simples em char
        System.out.println(letra);

        char valor = 66; //Tabela Unicode, semelhante a ASCII
        System.out.println(valor); //printar 'B'

        valor = (char) (valor +1); //posso somar para mudar valor do char
        System.out.println(valor);

        String palavra = "Eu sou um aluno iniciante?";
        System.out.println(palavra);

        palavra = palavra + " 2020";// posso concatenar sem aspas
        System.out.println(palavra);
    }


}
