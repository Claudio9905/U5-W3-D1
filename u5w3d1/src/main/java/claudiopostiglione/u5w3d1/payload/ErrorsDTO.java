package claudiopostiglione.u5w3d1.payload;

import java.time.LocalDate;

public record ErrorsDTO(
        String message,
        LocalDate timestamp
) {
}
