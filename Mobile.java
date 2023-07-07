package OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mobileDetails")
public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mobId;
	
	private String barndName;
	private int totalCost;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mobile [mobId=").append(mobId).append(", barndName=").append(barndName).append(", totalCost=")
				.append(totalCost).append("]");
		return builder.toString();
	}
	public String getBarndName() {
		return barndName;
	}
	public void setBarndName(String barndName) {
		this.barndName = barndName;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	
}
