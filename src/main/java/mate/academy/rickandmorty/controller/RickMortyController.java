package mate.academy.rickandmorty.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.rickandmorty.dto.internal.CharacterResponseDto;
import mate.academy.rickandmorty.service.CharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/characters")
public class RickMortyController {

    private final CharacterService characterService;

    @GetMapping("/random")
    CharacterResponseDto generateWiki() {
        return characterService.getRandomWiki();
    }

    @GetMapping
    List<CharacterResponseDto> getAllCharactersNameLike(@RequestParam String name) {
        return characterService.getCharactersWithNameLike(name);
    }
}
