package com.exam.examserver.entites;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@Data
@Builder
@Entity
//@Table(name = "")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userRoleId;
    @ManyToOne(fetch = FetchType.EAGER)
    private  User user;
    @ManyToOne
    private  Role role;
}
