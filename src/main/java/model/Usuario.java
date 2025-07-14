package model;

// Classe onde o usuario tera suas caracteristicas
public class Usuario {

    String Email;
    String Senha;

    public Usuario(String senha, String email) {
        Senha = senha;
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }
}
