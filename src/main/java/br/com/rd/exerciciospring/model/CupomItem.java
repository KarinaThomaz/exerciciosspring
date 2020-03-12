package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_cupom_item")
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cupom_item")
    private Long idCupomItem;

    @ManyToOne
    @JoinColumn(name="id_cupom")
    private Long idCupom;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="id_produto")
    private List<Produto> produtos;

    @Column(name="qt_produto", nullable = false)
    private Long qtProduto;

    @Column(name="vl_produto", nullable = false)
    private BigDecimal vlProduto;
}
