import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
	@Id
	@NonNull
	private String isbn;

	@NonNull
    private String title;

    @NonNull
    private String author;

    @NonNull
    private String year;

    @NonNull
    private String publisher;

    @NonNull
    private String imageUrlSmall;

    @NonNull
    private String imageUrlMedium;

    @NonNull
    private String imageUrlLarge;
}
