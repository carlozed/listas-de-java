package nivel1_fundamentos;

import java.util.ArrayList;
import java.util.List;

/**
 * EXERCÍCIO 2: Dispositivos Inteligentes (Herança Múltipla de Interfaces)
 *
 * Como rodar:
 * javac nivel1_fundamentos/Ex02DispositivosSmart.java
 * java nivel1_fundamentos.Ex02DispositivosSmart
 */
public class Ex02DispositivosSmart {

    public interface Conectavel {
        void conectarWifi(String rede);
        void desconectar();
    }

    public interface Iluminavel {
        void ajustarBrilho(int nivel); // 0 a 100
    }

    public interface Sonoro {
        void tocarAlerta(String som);
    }

    // TODO 1: Faça LampadaSmart implementar Conectavel e Iluminavel
    public static class LampadaSmart implements Conectavel, Iluminavel {
        private boolean conectada;
        @Override 
        public void conectarWifi(String rede){
            System.out.println("Lâmpada smart conectada à rede Wi-fi: " + rede);
            conectada = true;
        }
        
        public void desconectar(){
            if (conectada = true){
                System.out.println("Aparelho desconectado da rede Wi-fi");
                conectada = false;
            }
        }

        public void ajustarBrilho(int nivel){
            System.out.println("Brilho ajustado para: " + nivel);
        }
        
    }

    // TODO 2: Faça CaixaSomSmart implementar Conectavel e Sonoro
    public static class CaixaSomSmart implements Conectavel, Sonoro{

        private boolean conectada;

        @Override
        public void conectarWifi(String rede){
            System.out.println("Caixa de som smart conectada à rede Wi-fi: " + rede);
            conectada = true;
        }

        public void desconectar(){
            if (conectada = true){
                System.out.println("Aparelho desconectado da rede Wi-fi");
                conectada = false;
            }
        }

        public void tocarAlerta(String som){
            System.out.println("alerta");
        }
    }

    // TODO 3: Faça DespertadorSmart implementar AS 3 INTERFACES (Conectavel, Iluminavel, Sonoro)
    public static class DespertadorSmart implements Conectavel, Iluminavel, Sonoro{
        private boolean conectada;
        @Override
        public void conectarWifi(String rede){
            System.out.println("Despertador smart conectado à rede Wi-fi: " + rede);
            conectada = true;
        }

        public void desconectar(){
            if (conectada = true){
                System.out.println("Aparelho desconectado da rede Wi-fi");
                conectada = false;
            }
        }

        public void tocarAlerta(String som){
            System.out.println("alerta");
        }

        public void ajustarBrilho(int nivel){
            System.out.println("Brilho ajustado para: " + nivel);
        }
    }

    public static void conectarTodosNaRede(List<Conectavel> dispositivos, String nomeRede) {
        for (Conectavel d : dispositivos) {
            d.conectarWifi(nomeRede);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Teste de Dispositivos Smart ===");
        // TODO 4: Instancie LampadaSmart, CaixaSomSmart e DespertadorSmart
        // e passe todos para conectarTodosNaRede(...)
        LampadaSmart lampada = new LampadaSmart();
        DespertadorSmart despertador = new DespertadorSmart();
        CaixaSomSmart caixa = new CaixaSomSmart();

        List<Conectavel> dispositivos = new ArrayList<>();

        dispositivos.add(despertador);
        dispositivos.add(lampada);
        dispositivos.add(caixa);

        conectarTodosNaRede(dispositivos, "vivo");

    }
}
