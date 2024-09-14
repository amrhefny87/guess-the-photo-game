package personal.game.guessThePhoto.questions;

import org.springframework.web.multipart.MultipartFile;

public record QuestionRequest (
        String solution,
        int level,
        MultipartFile image
){
}
