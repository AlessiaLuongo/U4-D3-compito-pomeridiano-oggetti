package Esercizio3.Entites;

import java.util.Random;

public class Cliente {
    int codiceCliente;
    String nome;
    String cognome;
    String email;
    String dataIscrizione;

    public Cliente(String nome, String cognome, String email, String dataIscrizione) {
        Random codiceCliente = new Random();

        this.codiceCliente = codiceCliente.nextInt(1, 10000);
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codiceCliente=" + codiceCliente +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataIscrizione='" + dataIscrizione + '\'' +
                '}';
    }
}
