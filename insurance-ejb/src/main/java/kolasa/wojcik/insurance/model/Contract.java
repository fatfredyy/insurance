package kolasa.wojcik.insurance.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contract {

	@Id
	@GeneratedValue
	private Long id;

	private String contractNumber;
	@Temporal(TemporalType.DATE)
	private Date validFrom;
	private ValidyPeriod validityPeriod;

	@OneToMany
	@JoinTable(name = "CONTRACT_PRODUCT")
	private List<Product> products;

	public Contract() {
		products = new ArrayList<Product>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public ValidyPeriod getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(ValidyPeriod validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

}
