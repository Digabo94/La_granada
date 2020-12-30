package mx.com.sungal.data;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.com.sungal.domain.Fruta;

public interface FrutaDao extends JpaRepository<Fruta, Integer>{
}
