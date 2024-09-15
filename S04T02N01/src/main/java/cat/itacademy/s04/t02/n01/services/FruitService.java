package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {
    @Autowired
    private FruitRepository fruitRepository;

    public Fruit addFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public Fruit updateFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public void deleteFruit(int id) {
        fruitRepository.deleteById(id);
    }

    public Fruit getOneFruit(int id) {
        return fruitRepository.getReferenceById(id);
    }

    public List<Fruit> getAllFruit() {
        return fruitRepository.findAll();
    }

}
