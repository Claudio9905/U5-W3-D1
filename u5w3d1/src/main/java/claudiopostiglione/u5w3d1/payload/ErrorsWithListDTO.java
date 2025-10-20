package claudiopostiglione.u5w3d1.payload;

import java.time.LocalDate;
import java.util.List;

public record ErrorsWithListDTO(
        String message,
        LocalDate timestampe,
        List<String> errrorsList
) {
}
