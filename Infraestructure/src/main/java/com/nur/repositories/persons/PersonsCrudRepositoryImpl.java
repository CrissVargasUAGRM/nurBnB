package com.nur.repositories.persons;

import com.nur.messenger.factories.IPersonaFactory;
import com.nur.messenger.personas.Personas;
import com.nur.model.PersonaJpaModel;
import com.nur.utils.PersonsUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class PersonsCrudRepositoryImpl implements IPersonaFactory {
    @Autowired
    private IPersonsCrudRepository personsCrudRepository;

    @Override
    public Personas createPerson(String name, String lastName, String ci, UUID userId) {
        Personas person = new Personas(name, lastName, ci, userId);
        PersonaJpaModel model = PersonsUtils.personToJpaEntity(person);
        personsCrudRepository.save(model);
        return person;
    }
}
