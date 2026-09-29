import java.util.Scanner;

public class App {

    static class Maquina{
        int nivelAgua;
        int nivelShampoo;
        boolean maquinaSuja = true;
        private Pet petAtual;

        public void abastecerAgua(){

            if (nivelAgua <= 28){
                System.out.println("Abastecendo a água da máquina...");
                    nivelAgua = nivelAgua + 2;
                System.out.println("Água abastecida");
            } else {
                System.out.println("A máquina já está com o nível máximo de água (30L) ou não cabem 2 litros!");
            }
        }

        public void abastecerShampoo(){
            if (nivelShampoo <= 8){
                System.out.println("Abastecendo o shampoo da máquina...");
                    nivelShampoo = nivelShampoo + 2;
                System.out.println("Shampoo abastecido.");
            } else {
                System.out.println("A máquina já está com o nível máximo de shampoo (10L) ou não cabem 2 litros!");
            }
        }

        public void verificarAgua(){
            System.out.println("Nível de água: " + nivelAgua + "L");
        }

        public void verificarShampoo(){
            System.out.println("Nível de shampoo: " + nivelShampoo + "L");
        }

        public void limparMaquina(/* boolean maquinaSuja, double nivelAgua, double nivelShampoo */){
            if (!maquinaSuja){
                System.out.println("A máquina está limpa.");
                return;
            }
            if (nivelAgua >= 3 && nivelShampoo >= 1){
                System.out.println("Limpando máquina...");
            } else{
                System.out.println("Não foi possível limpar. Verifique os níveis de água e shampoo!");
                if (nivelAgua < 3){
                    System.out.println("Nível de água está baixo. Nível: " + nivelAgua + "L");
                } if (nivelShampoo < 1) {
                    System.out.println("Nível de shampoo está baixo. Nível: " + nivelShampoo + "L");
                }
            }
        }

        public void colocarPet(Pet pet){
            if (petAtual != null){
                System.out.println("A máquina já está ocupada.");
                return;
            }
            petAtual = pet;
            pet.petNaMaquina = true;
            System.out.println("Pet colocado na máquina.");
        }

        public void retirarPet(Pet pet){
            if (petAtual != null){
                System.out.println("Retirando o pet da máquina...");
                petAtual.petNaMaquina = false;
                petAtual = null;
                System.out.println("Pet retirado da máquina.");
            } else {
                System.out.println("A máquina está vazia...");
                return;
            }
        }

        public void darBanho(Pet pet){

            if (pet.petNaMaquina){
                if (nivelAgua < 10 || nivelShampoo < 2){
                    System.out.println("Não foi possível dar banho. Verifique os níveis de água e shampoo!");
                    return;
                }
                System.out.println("Dando banho no pet...");
                pet.petLimpo = true;
                nivelAgua = nivelAgua - 10;
                nivelShampoo = nivelShampoo - 2;
            } else {
                System.out.println("A máquina está vazia...");
            }
        }

        public void verificarPet(Pet pet){
            if (pet.petNaMaquina) {
                System.out.println("O pet está no banho.");
            } else {
                System.out.println("O pet não está no banho.");
            }
        }
    }
    static class Pet {
        boolean petLimpo = false;
        boolean petNaMaquina = false;

    }

    public static void main(String[] args) {
        Maquina maquina = new Maquina();

        maquina.abastecerAgua();

    }
}


/*

Escreva um código onde temos o controle de banho de um petshop, a maquina de banhos dos pets deve ter as seguintes operações:
    Dar banho no pet; ok
    Abastecer com água; ok
    Abastecer com shampoo; ok
    verificar nivel de água; ok
    verificar nivel de shampoo; ok
    verificar se tem pet no banho;
    colocar pet na maquina; ok
    retirar pet da máquina; ok
    limpar maquina. ok

Siga as seguintes regras para implementação

A maquina de banho deve permitir somente 1 pet por vez; ok
Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo; ok
A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo; ok
Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina para permitir a entrada de outro pet;
A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;

*/
