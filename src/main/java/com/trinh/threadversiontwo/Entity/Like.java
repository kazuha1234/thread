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
@Table(name = "user_likes")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    int likeId;

    @Column(nullable = false)
    int postId;

    @Column(nullable = false)
    int userId;

    @Column(nullable = false)
    int commentId;

    @Column(nullable = false)
    Date createdAt;

    @Column(nullable = false)
    boolean isDeleted;
}
