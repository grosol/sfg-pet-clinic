package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepositoty;
import guru.springframework.sfgpetclinic.services.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springjpa")
@RequiredArgsConstructor
public class PetSDJpaService implements PetService {

    private final PetRepository petRepositoty;

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepositoty.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepositoty.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepositoty.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepositoty.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepositoty.deleteById(aLong);
    }
}
