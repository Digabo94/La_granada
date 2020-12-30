package mx.com.sungal.service;

import java.util.List;
import mx.com.sungal.data.EspeciaDao;
import mx.com.sungal.domain.Especia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Qualifier("EspeciaService")
public class EspeciaService implements IService{
    //En esta clase va la logica del negocio

    @Autowired
    EspeciaDao especiaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Object> listarObjeto() {
        List<Object> lista = (List) especiaDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public void agregarObjeto(Object obj) {
        Especia especia = (Especia) obj;
        especiaDao.save(especia);
    }

    @Override
    @Transactional(readOnly = true)
    public Object encontrarObjeto(Object obj) {
        Especia especia = (Especia) obj;
        return especiaDao.findById(especia.getIdEspecia()).orElse(null);
    }

    @Override
    @Transactional
    public void borrarObjeto(Object obj) {
        Especia especia = (Especia) obj;
        especiaDao.delete(especia);
    }
    
}
