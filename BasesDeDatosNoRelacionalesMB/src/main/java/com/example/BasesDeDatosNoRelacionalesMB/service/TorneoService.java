package com.example.BasesDeDatosNoRelacionalesMB.service;

import com.example.BasesDeDatosNoRelacionalesMB.model.Torneo;
import com.example.BasesDeDatosNoRelacionalesMB.repository.TorneoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorneoService {

    private TorneoRepository torneoRepository;

    public TorneoService(TorneoRepository torneoRepository) {
        this.torneoRepository = torneoRepository;
    }

    public Torneo guardar(Torneo t){
        return torneoRepository.save(t);
    }

    public List<Torneo> buscarTodos(){
        return torneoRepository.findAll();
    }

}
