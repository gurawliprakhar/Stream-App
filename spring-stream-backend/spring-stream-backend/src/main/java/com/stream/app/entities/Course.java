package com.stream.app.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "yt_course")
public class Course {
    @Id
    private String id;
    private String title;
    @OneToMany(mappedBy = "course")
    private List<Video> list = new ArrayList<>();
}
