package com.assist.java.multitenancy.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "choirs")
public class Choir {

  @Id
  private String id;
  private String name;
  private List<Singer> singers;

}
