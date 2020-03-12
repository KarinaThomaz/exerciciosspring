package br.com.rd.exerciciospring.service;

import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service("CupomService")


public class CupomService {
    @Autowired
    CupomRepository repository;

    public List<Cupom> find(@PathVariable("idCliente") Long idCliente) {
        return repository.findByIdCliente(idCliente);
    }

    public List<Cupom> find(@PathVariable("dt_venda") String dt_venda) {
        return repository.findByDt_Venda(dt_venda);
    }


}
