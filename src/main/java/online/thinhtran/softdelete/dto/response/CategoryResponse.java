package online.thinhtran.softdelete.dto.response;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryResponse {
    private Integer id;

    private String name;

    private Instant createdAt;

    private Instant updatedAt;

    private String createdBy;

    private Instant deletedAt;
}
