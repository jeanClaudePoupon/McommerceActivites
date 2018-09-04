package com.mexpedition.web.controller;

import com.mexpedition.dao.ExpeditionDao;
import com.mexpedition.model.Expedition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ExpeditionController {

    @Autowired
    ExpeditionDao expeditionDao;

    //todo : s'occuper du return
    @PostMapping("/Expedition/add")
    public ResponseEntity<Void> ajouterExpedition(@RequestBody Expedition expedition) {

        Expedition expeAdded = expeditionDao.save(expedition);

    return null;
    }

    @GetMapping("/Expedition/{id}")
    public Optional<Expedition> trouverExpeParId(@PathVariable int id) {
        Optional<Expedition> expedition = expeditionDao.findById(id);
        return expedition;
    }

    //todo : s'occuper du return
    @PutMapping("/Expedition/update")
    public void modifierExpedition(@RequestBody Expedition expedition) {
    expeditionDao.save(expedition);
    }
}
