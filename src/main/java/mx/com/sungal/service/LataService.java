package mx.com.sungal.service;

import java.util.List;
import mx.com.sungal.data.LataDao;
import mx.com.sungal.domain.Lata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Qualifier("LataService")
public class LataService implements IService{
    //En esta clase va la logica del negocio
    
    @Autowired
    LataDao lataDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Object> listarObjeto() {
        List<Object> lista = (List) lataDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public void agregarObjeto(Object obj) {
        Lata lata = (Lata) obj;
        lataDao.save(lata);
    }

    @Override
    @Transactional(readOnly = true)
    public Object encontrarObjeto(Object obj) {
        Lata lata = (Lata) obj;
        return lataDao.findById(lata.getIdLata()).orElse(null);
    }

    @Override
    @Transactional
    public void borrarObjeto(Object obj) {
        Lata lata = (Lata) obj;
        lataDao.delete(lata);
    }
}
