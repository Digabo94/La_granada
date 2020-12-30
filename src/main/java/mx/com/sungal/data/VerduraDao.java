package mx.com.sungal.data;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.com.sungal.domain.Verdura;


public interface VerduraDao extends JpaRepository<Verdura, Integer>{
}
