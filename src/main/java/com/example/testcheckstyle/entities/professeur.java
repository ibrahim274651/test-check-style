package com.example.testcheckstyle.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class professeur {

    private Long id;
      private String nom;
    private String adresse;
    
}
