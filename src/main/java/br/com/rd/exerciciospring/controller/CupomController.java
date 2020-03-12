package br.com.rd.exerciciospring.controller;

import br.com.rd.exerciciospring.model.dto.CupomDTO;
import br.com.rd.exerciciospring.service.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CupomController {

    @Autowired
    CupomService service;

    @GetMapping("/cupom/{id_cliente}")
    public ResponseEntity buscarCLiente(@RequestBody CupomDTO cupomDTO){
        return ResponseEntity.ok().body(service.find(cupomDTO.idCliente));
    }

    @GetMapping()
    public ResponseEntity buscarData(@RequestBody CupomDTO cupomDTO){
        return ResponseEntity.ok().body(service.find(cupomDTO.dtVenda));
    }

}
