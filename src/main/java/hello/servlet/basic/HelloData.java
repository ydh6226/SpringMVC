package hello.servlet.basic;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class HelloData {
    private String username;
    private int age;
}
