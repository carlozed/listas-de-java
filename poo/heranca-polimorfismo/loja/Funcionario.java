public class Funcionario{
    protected String nome;
    protected String email;
    protected int senha;
    protected boolean admin;
    protected boolean logado;

    public Funcionario(String email, int senha, boolean admin, boolean logado){
        this.senha = senha;
        this.email = email;
        this.admin = admin;
        this.logado = logado;
    }

    public boolean realizarLogin(String emailDigitado, int senhaDigitada, boolean admin){
        if (this.email.equals(emailDigitado) && (this.senha == senhaDigitada && !this.logado)) {
            if (this.admin){
                System.out.println("Login realizado como admin com sucesso!");
            } else {
                System.out.println("Login realizado com sucesso!");
            }
            this.logado = true;
            return true;
        } else {
            System.out.println("Falha no login: E-mail ou senha inválidos.");
            return false;
        }
    }

    public void realizarLogoff(){
        if (this.logado == true){
            System.out.println("Log off realizado com sucesso!");
            this.logado = false;
        } else {
            System.out.println("Você não está logado.");
        }
    }
/*  TODO
    public void alterarDados(){

    }

    public void alterarSenha(){

    }
    */
}
