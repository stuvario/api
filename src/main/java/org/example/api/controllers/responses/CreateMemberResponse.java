package org.example.api.controllers.responses;

import org.example.api.entities.Member;

public record CreateMemberResponse(
        Member memberDto
) {}
