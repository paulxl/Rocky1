package paulxl.rocky1.entities;

import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rocky1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String ims;
	private String classification;
	private String mineralsWithIn;
	private String composition;
	private String locationFound;
	private String quality;
	private String periodFoundIn;
	private String comments;
	private String amplifyingDetails;
	private String bin;
	
	public Rocky1() {
	}

	public Rocky1(int id, String ims, String classification, String mineralsWithIn, String composition,
			String locationFound, String quality, String periodFoundIn, String comments, String amplifyingDetails,
			String bin) {
		super();
		this.id = id;
		this.ims = ims;
		this.classification = classification;
		this.mineralsWithIn = mineralsWithIn;
		this.composition = composition;
		this.locationFound = locationFound;
		this.quality = quality;
		this.periodFoundIn = periodFoundIn;
		this.comments = comments;
		this.amplifyingDetails = amplifyingDetails;
		this.bin = bin;
	}
	

	@Override
	public String toString() {
		return "Rocky1 [id=" + id + ", ims=" + ims + ", classification=" + classification + ", mineralsWithIn="
				+ mineralsWithIn + ", composition=" + composition + ", locationFound=" + locationFound + ", quality="
				+ quality + ", periodFoundIn=" + periodFoundIn + ", comments=" + comments + ", amplifyingDetails="
				+ amplifyingDetails + ", bin=" + bin + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIms() {
		return ims;
	}

	public void setIms(String ims) {
		this.ims = ims;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getMineralsWithIn() {
		return mineralsWithIn;
	}

	public void setMineralsWithIn(String mineralsWithIn) {
		this.mineralsWithIn = mineralsWithIn;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getLocationFound() {
		return locationFound;
	}

	public void setLocationFound(String locationFound) {
		this.locationFound = locationFound;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getPeriodFoundIn() {
		return periodFoundIn;
	}

	public void setPeriodFoundIn(String periodFoundIn) {
		this.periodFoundIn = periodFoundIn;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getAmplifyingDetails() {
		return amplifyingDetails;
	}

	public void setAmplifyingDetails(String amplifyingDetails) {
		this.amplifyingDetails = amplifyingDetails;
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rocky1 other = (Rocky1) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	

}
