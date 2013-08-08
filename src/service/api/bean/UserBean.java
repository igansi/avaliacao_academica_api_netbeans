/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service.api.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * Usuário como sendo bean de transporte.
 * @author Igansi
 */
public class UserBean implements Serializable {
    
    private String cpf;
    private Date dataNascimento;
    private String email;
    private String nome;
    private String tipo;
    
    public UserBean() {}

    public UserBean(String cpf, Date dataNascimento, String email, String nome, String tipo) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.cpf, this.dataNascimento, this.email, this.nome, this.tipo);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserBean other = (UserBean) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UsuarioBean{" + "cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", email=" + email + ", nome=" + nome + ", tipo=" + tipo + '}';
    }
}
