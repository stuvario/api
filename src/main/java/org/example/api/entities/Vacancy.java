package org.example.api.entities;

import java.util.UUID;

public class Vacancy {
    private UUID id;
    private Company company;
    private Member member;
    private String title;
    private String description;
    private Long created;
}
