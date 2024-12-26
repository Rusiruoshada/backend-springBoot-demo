package dev.roms.backend_movie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movies {
    @Id
    private ObjectId id;
    private String imdbId, title, releaseDate, trailerLink, poster;
    private List<String> genre, backdrops;
    @DocumentReference
    private List<Review> reviewIds;
}
