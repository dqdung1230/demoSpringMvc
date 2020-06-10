package vn.itsol.demo.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@ToString
public class Member {
    int id;
    String username;
    String password;
    String name;
    String address;
    int age;
    boolean isAdult;
    String gender;
    String country;
    String hiddenInfor;
}
