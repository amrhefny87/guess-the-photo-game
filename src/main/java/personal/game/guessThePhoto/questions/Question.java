package personal.game.guessThePhoto.questions;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String solution;
    private int level;
    private String imageUrl;

    public Question(String solution, int level, String imageUrl) {
        this.solution = solution;
        this.level = level;
        this.imageUrl = imageUrl;
    }

    public Question(Long id, String solution, int level, String imageUrl) {
        this(solution, level, imageUrl);
        this.id = id;
    }

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public String getSolution() {
        return solution;
    }

    public int getLevel() {
        return level;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
