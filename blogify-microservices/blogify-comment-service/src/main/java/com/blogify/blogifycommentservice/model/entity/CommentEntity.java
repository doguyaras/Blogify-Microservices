package com.blogify.blogifycommentservice.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "comment")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long commentId;
    @Column(name = "content")
    private String content;
    @Column(name = "creationdate")
    private Date creationDate;
    @Column(name = "articleid")
    private Long articleId;
    @Column(name = "userid")
    private Long userId;
}
