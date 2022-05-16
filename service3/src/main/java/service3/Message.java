package service3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;

  @Column
  String contents;
}
