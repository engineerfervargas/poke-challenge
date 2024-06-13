package mx.com.bankaya.poke.challenge.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String ip;
	private Timestamp date;
	private String method;

}
