package com.trinh.threadversiontwo.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    int userId;
    String userName;
    String email;
    String phoneNumber;
    String password;
    Date dateOfBirth;
    String displayName;
    String bio;
    String avatarUrl;
    String coverUrl;
    Date updatedAt;
    String status;
    boolean isVerified;
    Date lastLoginAt;
    String role;
    boolean isDeleted;
}
