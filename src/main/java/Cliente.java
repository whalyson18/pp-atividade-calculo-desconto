import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Cliente {
    @Getter @Setter private long id;
    @Getter @Setter private String nome;
    @Getter @Setter private LocalDate dataNascimento;

    public Cliente() {/**/}

    public Cliente(long id, String nome, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
