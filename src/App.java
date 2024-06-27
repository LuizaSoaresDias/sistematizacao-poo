import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.next();
        funcionario.setNome(nome);
        
        System.out.println("Digite a matrícula do funcionário:");
        int matricula = scanner.nextInt();
        funcionario.setMatricula(matricula);
        scanner.nextLine();

        System.out.println("Digite as alergias (separadas por vírgula):");
        String alergiasInput = scanner.nextLine();
        List<String> alergias = new ArrayList<>();
        for(String alergia: alergiasInput.split(",")){
            alergias.add(alergia.trim());
        }
        funcionario.setAlergias(alergias);

        System.out.println("Digite os problemas médicos (separados por vírgula):");
        String problemasMedicosInput = scanner.nextLine();
        List<String> problemasMedicos = new ArrayList<>();
        for(String problema : problemasMedicosInput.split(",")) {
            problemasMedicos.add(problema.trim());
        }
        funcionario.setProblemasMedicos(problemasMedicos);

        System.out.println("Digite os telefones (separados por vírgula):");
        String telefonesInput = scanner.nextLine();
        List<String> telefones = new ArrayList<>();
        for(String telefone : telefonesInput.split(",")) {
            telefones.add(telefone.trim());
        }
        funcionario.setTelefones(telefones);

        System.out.println("Digite os emails (separados por vírgula):");
        String emailsInput = scanner.nextLine();
        List<String> emails = new ArrayList<>();
        for(String email: emailsInput.split(",")){
            emails.add(email.trim());
        }
        funcionario.setEmails(emails);

        scanner.close();

        System.out.println("\n=================\n");

        System.out.println("Funcionário registrado com sucesso:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Alergias: " + String.join(", ", funcionario.getAlergias()));
        System.out.println("Problemas Médicos: " + String.join(", ", funcionario.getProblemasMedicos()));
        System.out.println("Telefones: " + String.join(", ", funcionario.getTelefones()));
        System.out.println("Emails: " + String.join(", ", funcionario.getEmails()));
    }
}
