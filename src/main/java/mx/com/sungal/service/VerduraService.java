package mx.com.sungal.service;

import java.util.List;
import mx.com.sungal.data.VerduraDao;
import mx.com.sungal.domain.Verdura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Qualifier("VerduraService")
public class VerduraService implements IService{
    
    @Autowired
    private VerduraDao verduraDao;

    @Override
    @Transactional(readOnly = true)
    public List<Object> listarObjeto() {
        List<Object> lista = (List) verduraDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public void agregarObjeto(Object obj) {
        Verdura verdura = (Verdura) obj;
        verduraDao.save(verdura);
    }

    @Override
    @Transactional(readOnly = true)
    public Object encontrarObjeto(Object obj) {
        Verdura verdura = (Verdura) obj;
        return verduraDao.findById(verdura.getIdVerdura()).orElse(null);
    }

    @Override
    @Transactional
    public void borrarObjeto(Object obj) {
        Verdura verdura = (Verdura) obj;
        verduraDao.delete(verdura);
    }
    
    
}
