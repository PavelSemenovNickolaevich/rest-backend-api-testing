package qa.guru.restbackend.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
public class UserInfo {

    private Date loginDate;
    private String username;

    @Override
    public String toString() {
        return "UserInfo{" +
                "loginDate=" + loginDate +
                ", username='" + username + '\'' +
                '}';
    }
}

