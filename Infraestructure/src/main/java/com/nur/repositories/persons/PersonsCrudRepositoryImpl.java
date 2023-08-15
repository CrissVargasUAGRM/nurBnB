package com.nur.repositories.persons;

import com.nur.model.Personas;
import com.nur.model.PersonaJpaModel;
import com.nur.repositories.IPersonRepository;
import com.nur.utils.PersonsUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;
import java.util.UUID;

public class PersonsCrudRepositoryImpl implements IPersonRepository {
    @Autowired
    private IPersonsCrudRepository personsCrudRepository;

    @Override
    public UUID update(Personas person) {
        Personas persons = new Personas(person.getName(), person.getLastName(), person.getCi(), person.getUserId());
        PersonaJpaModel model = PersonsUtils.personToJpaEntity(persons);
        personsCrudRepository.save(model);
        return personsCrudRepository.save(model).getId();
    }

    @Override
    public Personas getById(UUID id) {
        try {
            return PersonsUtils.jpaToPersons(Objects.requireNonNull(personsCrudRepository.findById(id).orElse(null)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
