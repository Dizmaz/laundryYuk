package laundryyuk.laundry_yuk.model;


import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ReviewDTO {

    private Long id;

    @Size(max = 255)
    private String konten;


}
