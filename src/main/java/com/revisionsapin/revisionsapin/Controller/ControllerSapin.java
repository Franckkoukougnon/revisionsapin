package com.revisionsapin.revisionsapin.Controller;


import com.revisionsapin.revisionsapin.Entity.SapinEntity;
import com.revisionsapin.revisionsapin.Repository.SapinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "sapin")
public class ControllerSapin {
    @Autowired
    SapinRepository sapinRepo;
    @GetMapping(path = "get")
    public Optional<SapinEntity>   getSapin(@RequestParam long sapinId ){
        if(sapinRepo.findById(sapinId).isEmpty()) return Optional.empty();
        return sapinRepo.findById(sapinId);

    }

    @PostMapping(path = "create")
    public Long CreateSapin (){
          SapinEntity sapin = new SapinEntity();
          sapinRepo.save(sapin);
          return sapinRepo.count();
    }


}
