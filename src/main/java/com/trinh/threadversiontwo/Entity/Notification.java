package com.trinh.threadversiontwo.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    int notificationId;

    @Column(nullable = false)
    int userId;

    @Column(nullable = false)
    int targetId;

    String type;
    String content;
    String createdAt;
    boolean isRead;
}
