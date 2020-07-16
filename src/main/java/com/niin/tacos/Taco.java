package com.niin.tacos;

import java.util.List;
import java.util.Date;
import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Taco {
  
  private long id;

  private Date createdAt;

  @NotNull
  @Size(min=5, message="Name must be at least 5 characters long")
  private String name;

  @Size(min=1, message="You must choose at least 1 character")
  private List<String> ingredients;

}
