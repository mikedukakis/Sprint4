package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    @Autowired
    private FruitService fruitService;

    @PostMapping("/add")
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit) {
        Fruit addedFruit = fruitService.addFruit(fruit);
        return new ResponseEntity<>(addedFruit, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Fruit> updateFruit(@RequestBody Fruit fruit) {
        Fruit updatedFruit = fruitService.updateFruit(fruit);
        return new ResponseEntity<>(updatedFruit, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteFruit(@PathVariable("id") int id) {
        fruitService.deleteFruit(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getOneFruit(@PathVariable("id") int id) {
        Fruit fruit = fruitService.getOneFruit(id);
        return new ResponseEntity<>(fruit, HttpStatus.OK);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Fruit>> getAllFruit() {
        List<Fruit> fruitList = fruitService.getAllFruit();
        return new ResponseEntity<>(fruitList, HttpStatus.OK);
    }

}