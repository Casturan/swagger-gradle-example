package com.dturan;

import com.dturan.api.PetsApi;
import com.dturan.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PetsController implements PetsApi {

  @Override
  public ResponseEntity<List<Pet>> petsGet() {
    final Pet pet = new Pet();
    pet.setId(3L);
    pet.setName("Mr. Meowgi");
    pet.setTag("AJASFIUH*");

    final Pet pet2 = new Pet();
    pet2.setId(4L);
    pet2.setName("Mittens");
    pet2.setTag("MDFIUEN*");

    return new ResponseEntity<>(Arrays.asList(pet, pet2), HttpStatus.OK);
  }
}
