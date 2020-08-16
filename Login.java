import java.util.Scanner;

class CadastroeLogin {
    public static void main(String[] args) {
        System.out.println("Cadastrar usuário");

        System.out.print("Nome Completo: ");
        Scanner scanner = new Scanner(System.in);

        String nomeCompleto = scanner.nextLine();
        nomeCompleto = nomeCompleto.replaceAll("\\s+$", "");
        int tamanhoNome = nomeCompleto.length();


        System.out.println("Nome de Usuário ");
        String inicial = String.valueOf(nomeCompleto.charAt(0));
        String ultimo = nomeCompleto.substring(nomeCompleto.lastIndexOf(" "), tamanhoNome).trim();
        String usuario = inicial.toLowerCase() + "_" + ultimo.toLowerCase();
        System.out.println(usuario);

        System.out.print("senha:");

        String senha = scanner.nextLine();

        senha = senha.replaceAll("\\s+$", "");
        if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-!@])(?=.*[A-Z])(?=.*\\d).+") && senha.length() >= 8) {

            System.out.println("Senha válida");
        } else {
            System.out.println("senha invalida");
        }

        if (loginUser(usuario) && loginPwd(senha)){
            System.out.println("login realizado com sucesso!");
        }

    }
    public static boolean loginUser(String usuario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Login:");
        String vuser = scanner.nextLine();
        if (vuser.equals(usuario)){
            return true;
        } else {
            System.out.println("usuário não encontrado.");
            return false;

        }
    }

    public static boolean  loginPwd(String senha){
        Scanner scanner = new Scanner(System.in);
        System.out.println("senha:");
        String vSenha = scanner.nextLine();
        if (vSenha.equals(senha)){
            return true;
        } else {
            System.out.println("senha incorreta.");
            return false;
        }
    }

}