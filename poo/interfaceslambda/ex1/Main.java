public class Main {
    public static void main(String[] args) {
        Mensagem.CanalMensagem meuSms = new Mensagem.Sms();
        Mensagem.CanalMensagem meuEmail = new Mensagem.Email();
        Mensagem.CanalMensagem meuWhats = new Mensagem.whatsapp();
        Mensagem.CanalMensagem redes = new Mensagem.redesSociais();

        meuWhats.enviar("Olá, cliente!");
        meuSms.enviar("Olá, cliente!");
        meuEmail.enviar("Olá, cliente!");
        redes.enviar("Olá, cliente!");
    }
}
