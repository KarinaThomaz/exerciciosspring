package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_cupom")
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cupom", nullable = false)
    private Long idCumpom;

    @Column(name="id_cliente")
    private Long idCliente;

    @Column(name="dt_venda", nullable = false)
    private String dt_venda;

    @Column(name="vl_venda", nullable = false)
    private BigDecimal vlVenda;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_cupom")
//    private List<CupomItem> itensCupom;

}
