package model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private int matricula;
    private String nome;
    private List<String> alergias;
    private List<String> problemasMedicos;
    private List<String> telefones;
    private List<String> emails;

    public Funcionario() {
        alergias = new ArrayList<>();
        problemasMedicos = new ArrayList<>();
        telefones = new ArrayList<>();
        emails = new ArrayList<>();
    }

    public Funcionario(int matricula, String nome, List<String> alergias, List<String> problemasMedicos,
            List<String> telefones, List<String> emails) {
        this.matricula = matricula;
        this.nome = nome;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
        this.telefones = telefones;
        this.emails = emails;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<String> getAlergias() {
        return alergias;
    }
    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }
    public List<String> getProblemasMedicos() {
        return problemasMedicos;
    }
    public void setProblemasMedicos(List<String> problemasMedicos) {
        this.problemasMedicos = problemasMedicos;
    }
    public List<String> getTelefones() {
        return telefones;
    }
    public void setTelefones(List<String> telefones) {
        this.telefones = telefones;
    }
    public List<String> getEmails() {
        return emails;
    }
    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
}