package com.example.pbl.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequirementRequest {
    Long author_id;
    List <Long> recipient_id;
    String description;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Indochina")
    Date date;
}