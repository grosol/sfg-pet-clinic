package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepositoty;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springjpa")
@RequiredArgsConstructor
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepositoty petTypeRepositoty;

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepositoty.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepositoty.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepositoty.save(object);
    }

    @Override
    public void delete(PetType object) {
            petTypeRepositoty.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepositoty.deleteById(aLong);
    }
}
