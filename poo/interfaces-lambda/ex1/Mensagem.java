public class Mensagem {

    /**
     * CanalMensagem
     */
    public static interface CanalMensagem {
        void enviar(String conteudo);
    }

    public static class Sms implements CanalMensagem{
        public void enviar(String conteudo){
            System.out.println("Conectando na API de SMS... Enviando: " + conteudo);
        }
    }

    public static class Email implements CanalMensagem{
        public void enviar(String conteudo){
            System.out.println("Conectando no servidor SMTP... Enviando: " + conteudo);
        }
    }

    public static class whatsapp implements CanalMensagem{
        public void enviar(String conteudo){
            System.out.println("Enviando via Whatsapp: "+ conteudo);
        }
    }

    public static class redesSociais implements CanalMensagem{
        public void enviar(String conteudo){
            System.out.println("Conectando na API da rede social: " + conteudo);
        }
    }

}
