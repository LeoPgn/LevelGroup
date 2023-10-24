package org.example.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fornecedor_id")
    private Long id;
    @Column(name = "fornecedor_nome")
    private String nome;
    @Column(name = "fornecedor_endereco")
    private String endereco;
    @Column(name = "fornecedor_contato")
    private Double contato;

    @OneToMany(mappedBy = "fornecedor", orphanRemoval = true)
    private List<Produto> produtos;

}
