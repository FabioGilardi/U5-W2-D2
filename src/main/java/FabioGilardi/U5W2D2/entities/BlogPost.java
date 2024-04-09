package FabioGilardi.U5W2D2.entities;

import FabioGilardi.U5W2D2.enums.BlogType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BlogPost {
    private long id;
    private BlogType blogType;
    private String title, content, cover;
    private int readingTime;
}
