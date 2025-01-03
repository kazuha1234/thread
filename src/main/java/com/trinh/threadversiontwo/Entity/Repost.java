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
public class Repost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    int repostId;

    @Column(nullable = false)
    int userId;

    @Column(nullable = false)
    int originalPostId;

    @Column(nullable = false)
    int commentId;

    Date createdAt;
    boolean isDeleted;
}
