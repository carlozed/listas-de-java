public class cinema {

    public class Ingresso {
        protected double valor;
        protected String nomedoFilme;
        protected boolean dublado;
        protected boolean legendado;

        public Ingresso(double valor, String nomedoFilme, boolean dublado, boolean legendado){
            this.valor = valor;
            this.nomedoFilme = nomedoFilme;
            this.dublado = dublado;
            this.legendado = legendado;
        }

        public double getprecoFinal(){
            return this.valor;
        }
    }

        class meiaEntrada extends Ingresso {
            public meiaEntrada(double valor, String nomedoFilme, boolean dublado, boolean legendado){
                super(valor, nomedoFilme, dublado, legendado);
            }
            @Override
            public double getprecoFinal(){
                return super.getprecoFinal() / 2;
            }
        }

        class familia extends Ingresso {
            private int numeroPessoas;

            public familia(double valor, String nomedoFilme, boolean dublado, boolean legendado, int numeroPessoas){
                super(valor, nomedoFilme, dublado, legendado);
                this.numeroPessoas = numeroPessoas;
            }

            @Override
            public double getprecoFinal(){
                double valorTotal = this.valor * this.numeroPessoas;

                if (this.numeroPessoas > 3){
                    valorTotal = valorTotal * 0.95;
                }
                return valorTotal;
            }
        }

    public static void main(String[] args) {
        cinema sistema = new cinema();

        Ingresso ingressoComum = sistema.new Ingresso(30.0, "Avatar", true, false);
        System.out.println("Ingresso Comum: " + ingressoComum.getprecoFinal());

        meiaEntrada meia = sistema.new meiaEntrada(30.0, "Avatar", true, false);
        System.out.println("Meia Entrada: " + meia.getprecoFinal());

        familia ingressoFamilia = sistema.new familia(30.0, "Vingadores", false, true, 4);
        System.out.println("Ingresso Família (4 pessoas): " + ingressoFamilia.getprecoFinal());
    }
}

/*
    Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser comercializados em um cinema.
    O ingresso deve ter um valor, nome do filme e informar se é dublado ou legendado. A partir desse ingresso
    devem ser criados os tipos Meia entrada e ingresso família. Cada ingresso deve ter um método que retorna o
    seu valor real ( baseado no valor informado na criação do ingresso) para os de meia entrada o seu valor
    deve ser de metade do valor, para os ingressos família deve-se retornar o valor multiplicado pelo número
    de pessoas e fornecer um desconto de 5% quando o número de pessoas for maior que 3.
*/
