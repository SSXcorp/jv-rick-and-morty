package mate.academy.rickandmorty.repository;

import java.util.List;
import mate.academy.rickandmorty.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {

    boolean existsByExternalId(String externalId);

    List<Character> findByNameContainingIgnoreCase(String name);
}
