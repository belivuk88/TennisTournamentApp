package ftninformatika.test.projekat.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Takmicenje {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (unique = true)
	private String naziv;
	
	@Column(nullable = false)
	private String mestoOdrzavanja;
	
	@Column(nullable = false)
	private String datumPocetka;
	
	@Column(nullable = false)
	private String datumZavrsetka;
	
	@ManyToOne
	Format format;
	
	@OneToMany(mappedBy = "takmicenje", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Prijava> prijave = new ArrayList<Prijava>();
	

	public Takmicenje() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getMestoOdrzavanja() {
		return mestoOdrzavanja;
	}

	public void setMestoOdrzavanja(String mestoOdrzavanja) {
		this.mestoOdrzavanja = mestoOdrzavanja;
	}

	public String getDatumPocetka() {
		return datumPocetka;
	}

	public void setDatumPocetka(String datumPocetka) {
		this.datumPocetka = datumPocetka;
	}

	public String getDatumZavrsetka() {
		return datumZavrsetka;
	}

	public void setDatumZavrsetka(String datumZavrsetka) {
		this.datumZavrsetka = datumZavrsetka;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Takmicenje other = (Takmicenje) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Takmicenje [id=" + id + ", naziv=" + naziv + ", mestoOdrzavanja=" + mestoOdrzavanja + ", datumPocetka="
				+ datumPocetka + ", datumZavrsetka=" + datumZavrsetka + ", format=" + format + "]";
	}

	
	
	
	
	
	
	

}
