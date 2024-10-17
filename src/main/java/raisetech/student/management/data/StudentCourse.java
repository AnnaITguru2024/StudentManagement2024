package raisetech.student.management.data;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "受講生コース情報")
@Getter
@Setter
public class StudentCourse {

  @Pattern(regexp = "^\\d+$")
  private int id;

  @Pattern(regexp = "^\\d+$")
  private String studentId;

  @NotBlank
  private String courseName;
  private LocalDateTime startDate;
  private LocalDateTime endDate;
}