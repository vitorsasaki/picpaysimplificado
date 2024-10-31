package com.picpaysimplificado.picpaysimplificado.domain.usuario;

import com.picpaysimplificado.picpaysimplificado.Enum.TipoUsuario;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity (name = "usuario")
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of ="id")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @Column(unique = true)
    private String cpfCnpj;

    @Column(unique = true)
    private String email;

    private String senha;

    private TipoUsuario tipoUsuario;

    @Column(precision = 12, scale = 2)
    private BigDecimal saldo;



}
