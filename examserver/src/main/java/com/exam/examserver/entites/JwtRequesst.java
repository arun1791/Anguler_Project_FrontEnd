package com.exam.examserver.entites;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtRequesst {
    String  username;
    String password;
}
